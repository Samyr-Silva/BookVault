package com.bookvault.vault.services;

import com.bookvault.vault.models.Book;
import com.bookvault.vault.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private BookRepository bookRepository;

    public Optional<Book> getBookById(Long id){
        return bookRepository.findById(id);
    }

    public List<Book> bookList(){
        return bookRepository.findAll();
    }

    public Book addBook(Book book){
        bookRepository.save(book);
        return book;
    }

    public void deleteBookById(Long id){
        bookRepository.deleteById(id);
    }
}
