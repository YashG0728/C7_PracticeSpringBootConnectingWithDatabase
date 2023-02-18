package com.example.c1_bootjpaexample.service;

import com.example.c1_bootjpaexample.model.BookModel;
import com.example.c1_bootjpaexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {
    @Autowired
    private UserRepository userRepository;

    //get all books
    public List<BookModel> getAllBooks() {
        List<BookModel> list = this.userRepository.findAll();
        return list;
    }

    //get book by id
    public BookModel getBookById(int id) {
        BookModel bookModel = null;
        try {
            this.userRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookModel;
    }

    //adding the book
    public BookModel addDataIntoList(BookModel bookModel) {
        BookModel result = userRepository.save(bookModel);
        return result;
    }

    //delete the book
    public void deleteData(int id) {
        userRepository.deleteById(id);
    }

    public void updateBook(BookModel bookModel, int id) {
        bookModel.setId(id);
        userRepository.save(bookModel);
    }
}
