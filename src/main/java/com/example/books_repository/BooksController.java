package com.example.books_repository;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
    private final BooksRepository booksRepository;

    BooksController(BooksRepository booksRepository){
        this.booksRepository = booksRepository;
    }

    @GetMapping("/allBooks")
    public List<Books> allBooks(){
        return booksRepository.findAll();
    }
    
    @GetMapping("/book/{id}")
    Books singleBook(@PathVariable Long id){
        return booksRepository.findById(id).orElseThrow(()-> new RuntimeException("Could not find requested book" +id));
    }

    @PostMapping("/book")
    Books addBook(@RequestBody Books books){
        return booksRepository.save(books);
    }

    @PutMapping("/book/{id}")
    Books replaceBook(@RequestBody Books newbook, @PathVariable Long id){
        return booksRepository.findById(id)
        .map(books -> {
            books.setTitle(newbook.getTitle());
            books.setAuthor(newbook.getAuthor());
            books.setGenre(newbook.getGenre());
            return booksRepository.save(books);})
            .orElseGet(()-> {newbook.setId(id); return booksRepository.save(newbook);});
    }
    
    // post/put request through Postman using raw json body as follows
    // {
    //     "title": "test",
    //     "author": "tester",
    //     "genre": "testing"
    // }

    @DeleteMapping("/book/{id}")
    void deleteBook(@PathVariable Long id){
        booksRepository.deleteById(id);
    }
}
