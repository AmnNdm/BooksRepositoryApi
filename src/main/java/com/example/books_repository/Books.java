package com.example.books_repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//the entity class, to create attributes and then set/get the entity's attributes
@Entity
public class Books {
    private @Id @GeneratedValue Long id;
    private String title;
    private String author;
    private String genre;

    Books(){}

    Books(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return this.id;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return this.author;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getGenre(){
        return this.genre;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((genre == null) ? 0 : genre.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Books other = (Books) obj;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (genre == null) {
            if (other.genre != null)
                return false;
        } else if (!genre.equals(other.genre))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Books [ id=" + id + ", title=" + title + ", author=" + author + ", genre=" + genre + " ]";
    }
}
