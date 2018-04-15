package com.kodilla.measuringTime;

import java.util.Random;

public class BookGenerator {
    private Book book;

    public Book createBook() {
        String author = createWord();
        String title = createWord();

        return new Book(author, title);
    }

    private String createWord() {
        Random random = new Random();
        int length = random.nextInt(10) + 1;
        StringBuilder builder = new StringBuilder();
        char character;

        while (length > 0) {
            character = (char)(random.nextInt('a') + 'z');
            builder.append(character);
            length--;
        }
        return  builder.toString();
    }
}
