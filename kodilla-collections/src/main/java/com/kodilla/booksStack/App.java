package com.kodilla.booksStack;

public class App {
    public static void main (String[] args) {

        BooksStack stack = new BooksStack();

        System.out.println("Adding books on stack.");
        stack.pushBook(new Book("Assassins' Creed the Book", "William Shakespeare", 2016));
        stack.pushBook(new Book("Book of jungle", "Rudyard Kipling", 1894));
        stack.pushBook(new Book("50 shades of gray - lexicon for graphicians", "Dante Alighieri", 1572));
        stack.pushBook(new Book("Clean code", "Robert Martin", 2014));
        stack.pushBook(new Book("The innovator's Dilemma", "Clayton Christensen", 2010));

        System.out.println();
        stack.printSize();

        System.out.println();
        stack.printAllBooks();

        int number = 2;
        System.out.println("\nRemoving " + number + " books:");
        stack.popBooks(number);

        System.out.println();
        stack.printSize();

        System.out.println("\nRemoving all remainding books.\nThe last removed book was: " + stack.popAllBooks());

        System.out.println();
        stack.printSize();

    }
}
