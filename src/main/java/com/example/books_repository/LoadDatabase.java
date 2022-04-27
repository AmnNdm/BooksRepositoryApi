package com.example.books_repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//preloading database from sql at initiation

public class LoadDatabase {
        private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

        @Bean
        //Spring Boot will run ALL CommandLineRunner beans once the application context is loaded.
        //this will create a copy of the BooksRepository and create 2 entites and store them.
        CommandLineRunner initDatabase(BooksRepository booksrepo){
            return args -> {
                //creating and saving data for learning purpose
                log.info("Preloading " + booksrepo.save(new Books("Design Patterns", "GFG", "Engineering")));
                log.info("Preloading " + booksrepo.save(new Books("Daffodils", "Unknown", "Poetry")));
            };
        }
}
