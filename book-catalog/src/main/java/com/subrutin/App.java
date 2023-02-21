package com.subrutin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subrutin.Domain.Author;
import com.subrutin.Service.BookService;
import com.subrutin.dto.BookDetailDTO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // Author author = new  Author();
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
        BookService bookService = (BookService) appContext.getBean("bookService");
        BookDetailDTO bookDetailDTO= bookService.findBookDetailById(1L);
        System.out.println("Book Detail ="+bookDetailDTO);
    }
}
