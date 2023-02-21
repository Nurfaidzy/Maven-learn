package com.subrutin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subrutin.Domain.Author;

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
        Author author = (Author) appContext.getBean("author");
        System.out.println("author name: " +author.getName());
        System.out.println("author id: " +author.getId());
    }
}
