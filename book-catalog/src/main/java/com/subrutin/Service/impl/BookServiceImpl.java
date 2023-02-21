package com.subrutin.Service.impl;

import com.subrutin.Domain.Author;
import com.subrutin.Domain.Book;
import com.subrutin.Repository.BookRepository;
import com.subrutin.Service.BookService;
import com.subrutin.dto.BookDetailDTO;

public class BookServiceImpl implements BookService {
    private Book book;

    private BookRepository bookRepository;

    public BookServiceImpl() {
        Author author =new Author();
        book = new Book(author);
      }

    @Override
    public BookDetailDTO findBookDetailById(Long bookId) {
      Book book= bookRepository.findBookById(bookId);
      BookDetailDTO dto = new BookDetailDTO();
      dto.setBookId(book.getId());
      dto.setAuthorName(book.getAuthor().getName());
      dto.setBookTitle(book.getTitle());
      dto.setBookDescription(book.getDescription());
      return dto;
      }

    public BookRepository getBookRepository() {
      return bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
      this.bookRepository = bookRepository;
    }    
}
