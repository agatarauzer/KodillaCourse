package com.kodilla.measuringTime;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class App {
    public static void main (String[] args) {

        BookGenerator generator = new BookGenerator();

        System.out.println("LINKED LIST");
        List<Book> booksInLinkedList = new LinkedList<>();

        int numberOfBooks = 1000000;
        while (numberOfBooks > 0) {
            booksInLinkedList.add(generator.createBook());
            numberOfBooks--;
        }

        System.out.println("Quantity of elements in the collection: " + booksInLinkedList.size());

        long begin = System.nanoTime();
        booksInLinkedList.remove(0);
        long end = System.nanoTime();

        System.out.println("Removing element from the beginning of the collection has taken: " + (end - begin) + " ms");

        begin = System.nanoTime();
        booksInLinkedList.remove(booksInLinkedList.size()-1);
        end = System.nanoTime();

        System.out.println("Removing element from the end of the collection has taken: " + (end - begin) + " ms");

        Book bookToAdd = generator.createBook();

        begin = System.nanoTime();
        booksInLinkedList.add(bookToAdd);
        end = System.nanoTime();

        System.out.println("Adding element at the end of the collection has taken: " + (end - begin) + " ms");

        begin = System.nanoTime();
        booksInLinkedList.add(0, bookToAdd);
        end = System.nanoTime();

        System.out.println("Adding element at the beginning of the collection has taken: " + (end - begin) + " ms");

        System.out.println("\nHASH MAP");
        Map<Integer, Book> booksInHashMap = new HashMap<>();

        numberOfBooks = 1000000;

        for (int i = 0; i < numberOfBooks; i++) {
            booksInHashMap.put(i, generator.createBook());
        }

        System.out.println("Quantity of elements in the collection: " + 	booksInHashMap.size());

        int key = 578900;

        begin = System.nanoTime();
        booksInHashMap.put(key, new Book("Author", "Book to find"));
        end = System.nanoTime();

        System.out.println("Adding element to the collection has taken: " + (end - begin) + " ms");

        begin = System.nanoTime();
        booksInHashMap.get(key);
        end = System.nanoTime();

        System.out.println("Searching element by the key in the collection has taken: " + (end - begin) + " ms");

        begin = System.nanoTime();
        booksInHashMap.remove(key);
        end = System.nanoTime();

        System.out.println("Removing element from the collection has taken: " + (end - begin) + " ms");

    }
}
