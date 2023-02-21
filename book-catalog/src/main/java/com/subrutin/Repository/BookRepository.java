package com.subrutin.Repository;

import com.subrutin.Domain.Book;

public interface BookRepository {
    public Book findBookById(Long id);
    
}
