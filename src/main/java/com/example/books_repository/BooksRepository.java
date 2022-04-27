package com.example.books_repository;

import org.springframework.data.jpa.repository.JpaRepository;

//repository interface to help access data for CRUD
//extends the jparepository which needs domain-type(Books) and id-type(Long) as parameters
public interface BooksRepository extends JpaRepository<Books, Long> {
            
}
