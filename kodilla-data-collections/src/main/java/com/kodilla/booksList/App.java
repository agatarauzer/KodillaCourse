package com.kodilla.booksList;

public class App {
    public static void main (String[] args) {

        System.out.println("TEST - LIST OF BOOKS");
        BooksList books = new BooksList();
        books.addBook(new Book("Java Podstawy", 2016));
        books.addBook(new Book("Czysty Kod", 2014));
        books.addBook(new Book("Przelomowe innowacje", 2010));
        books.printBooksPublishedInAndAfter(2011);
    }
}
