package com.bookstore;

import com.bookstore.service.BookstoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    private final BookstoreService bookstoreService;

    public MainApplication(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {
            bookstoreService.persistAuthor();
            bookstoreService.fetchAuthor();
        };
    }
}
/*
 * 
 * 
 * How To Convert Boolean To Yes/No Via AttributeConverter

Description: This application is an example of converting a Boolean to Yes/No strings via AttributeConverter. This kind of conversions are needed when we deal with legacy databases that connot be changed. In this case, the legacy database stores the booleans as Yes/No.

Key points:

implement a custom converter via AttributeConverter

 * 
 */
