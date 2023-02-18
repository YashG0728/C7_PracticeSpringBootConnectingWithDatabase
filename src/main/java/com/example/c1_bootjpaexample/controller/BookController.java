package com.example.c1_bootjpaexample.controller;

import com.example.c1_bootjpaexample.model.BookModel;
import com.example.c1_bootjpaexample.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    BookService bookService;


    @GetMapping("/getbook")
    public String getBooks() {
        return "I am learning springboot from youtube";
    }

    @PostMapping("/postbook")
    public BookModel postBooks() {
        BookModel bookModel = new BookModel();
        bookModel.setId(1);
        bookModel.setTitle("Java Refrence");
        bookModel.setAuthor("xyz");
        return bookModel;
    }

    @GetMapping("/getallbook")
    public ResponseEntity<List<BookModel>> getlistofbooks() {
        List<BookModel> allBooks = bookService.getAllBooks();
        if (allBooks.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(allBooks);
    }

    @GetMapping("/getbookusingid/{id}")
    public ResponseEntity<BookModel> getbookusingid(@PathVariable("id") int id) {
        BookModel book = bookService.getBookById(id);
        if (book == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }

    @PostMapping("/addingbooks")
    public ResponseEntity<BookModel> addDataBook(@RequestBody BookModel bookModel) {
        BookModel bookModel1 = null;
        try {
            bookModel1 = this.bookService.addDataIntoList(bookModel);
            System.out.println(bookModel);
            return ResponseEntity.of(Optional.of(bookModel1));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @DeleteMapping("/deletedata/{id}")
    public ResponseEntity<Void> deleteData(@PathVariable("id") int id) {
        try {
            this.bookService.deleteData(id);
            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<BookModel> update(@RequestBody BookModel bookmodel, @PathVariable("id") int id) {
        try {
            this.bookService.updateBook(bookmodel, id);
            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

}
