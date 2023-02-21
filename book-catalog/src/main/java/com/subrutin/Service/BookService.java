package com.subrutin.Service;

import com.subrutin.Domain.Author;
import com.subrutin.Domain.Book;

public class BookService {
    private Book book;

    public BookService(Book book) {
        Author author =new Author();
        book = new Book(author);
      }


    
}
