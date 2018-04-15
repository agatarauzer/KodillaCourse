package com.kodilla.booksStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BooksStack {
    Deque<Book> stack = new ArrayDeque<>();

    public void pushBook(Book book) {
        stack.push(book);
    }

    public Book popAllBooks() {
        Book book = null;
        while (!stack.isEmpty()) {
            book = stack.pop();
        }
        return book;
    }

    public void printAllBooks() {
        System.out.println("Titles (from the last added): ");
        for (Book book : stack) {
            System.out.println(book);
        }
    }

    public void printSize() {
        System.out.println("Books in stack: " + stack.size());
    }

    //addictional method to remove particular number of books
    public void popBooks(int number) {
        if (number > stack.size()) {
            number = stack.size();
            System.out.println("You can only remove " + number + " books!");
        }

        Book book = null;
        while (number > 0) {
            book = stack.pop();
            System.out.println("The book: " + book + " was removed from stack.");
            number--;
        }
    }
}
