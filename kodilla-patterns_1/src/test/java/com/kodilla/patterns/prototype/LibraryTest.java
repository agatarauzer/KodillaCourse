package com.kodilla.patterns.prototype;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTest {
    private Library library;

    @Before
    public void createLibrary() {
        library = new Library("My first library");
        library.addBook(new Book("aaaaa", "abbbbb", LocalDate.of(2012, 06, 12)));
        library.addBook(new Book("bbbbb", "bccccc", LocalDate.of(2013, 07, 13)));
    }

    @Test
    public void testShallowCopy_NumberOfBooks() {
        //Given
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("My second library");
        }
        catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        int libraryNumberOfBooks = library.getBooks().size();
        int clonedLibraryNumberOfBooks = clonedLibrary.getBooks().size();

        //Then
        Assert.assertEquals(libraryNumberOfBooks, clonedLibraryNumberOfBooks);
    }

    @Test
    public void testShallowCopy_BookIsRemovedFromBothLibraries() {
        //Given
        Book book = new Book("wwwww", "wzzzz", LocalDate.of(2017, 10, 17));
        library.addBook(book);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("My second library");
        }
        catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        clonedLibrary.getBooks().remove(book);
        int libraryNumberOfBooks = library.getBooks().size();
        int clonedLibraryNumberOfBooks = clonedLibrary.getBooks().size();

        //Then
        Assert.assertEquals(libraryNumberOfBooks, clonedLibraryNumberOfBooks);
    }

    @Test
    public void testDeepCopy_NumberOfBooks() {
        //Given
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.deepCopy();
            clonedLibrary.setName("My second library");
        }
        catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        int libraryNumberOfBooks = library.getBooks().size();
        int clonedLibraryNumberOfBooks = clonedLibrary.getBooks().size();

        //Then
        Assert.assertEquals(libraryNumberOfBooks, clonedLibraryNumberOfBooks);
    }

    @Test
    public void testDeepCopy_BookIsRemovedOnlyFromClonedLibrary() {
        //Given
        Book book = new Book("wwwww", "wzzzz", LocalDate.of(2017, 10, 17));
        library.addBook(book);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.deepCopy();
            clonedLibrary.setName("My second library");
        }
        catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        clonedLibrary.getBooks().remove(book);
        int libraryNumberOfBooks = library.getBooks().size();
        int clonedLibraryNumberOfBooks = clonedLibrary.getBooks().size();

        //Then
        Assert.assertNotEquals(libraryNumberOfBooks, clonedLibraryNumberOfBooks);
        Assert.assertEquals(3, libraryNumberOfBooks);
        Assert.assertEquals(2, clonedLibraryNumberOfBooks);
    }
}
