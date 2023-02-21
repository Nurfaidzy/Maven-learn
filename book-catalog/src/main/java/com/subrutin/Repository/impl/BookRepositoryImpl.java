package com.subrutin.Repository.impl;

import java.util.HashMap;
import java.util.Map;

import com.subrutin.Domain.Author;
import com.subrutin.Domain.Book;
import com.subrutin.Repository.BookRepository;

public class BookRepositoryImpl implements BookRepository{

    private Map<Long, Book> bookMap;

    public BookRepositoryImpl() {
        super();
        bookMap = new HashMap<Long,Book>();
        Author author = new Author();
        author.setId(1L);
        author.setName("Riansyah");
        author.setBirthDate(11028L);
        
        Book book1 = new Book(author);
        book1.setId(1L);
        book1.setTitle("learn spring core");
        book1.setDescription("learningnya susah ");
        bookMap.put(book1.getId(), book1);
    }

    @Override
    public Book findBookById(Long id) {
        Book book = bookMap.get(id);
        return book;
    }
    
}
