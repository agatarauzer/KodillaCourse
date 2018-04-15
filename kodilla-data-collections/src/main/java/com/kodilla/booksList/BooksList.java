package com.kodilla.booksList;

import java.util.LinkedList;
import java.util.List;

public class BooksList {
    private List<Book> books = new LinkedList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void printBooksPublishedInAndAfter(int year) {
        System.out.println("Books published in and after " + year + " year: ");
        for (Book b : books) {
            if (b.getYear() >= year) {
                System.out.println(b);
            }
        }
    }
}
