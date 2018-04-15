package com.kodilla.measuringTime;

import java.util.Objects;

public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        }
        if (this == otherObject) {
            return true;
        }
        if (!(otherObject instanceof Book)) {
            return false;
        }

        Book other = (Book)otherObject;

        return Objects.equals(title, other.title) && Objects.equals(author, other.author);
    }

    public int hashCode() {
        return Objects.hash(title, author);
    }
}
