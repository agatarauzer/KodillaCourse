package com.kodilla.patterns_2.adapter.bookclassifier;

import com.kodilla.patterns_2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns_2.adapter.bookclasifier.librarya.BookA;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTests {

    @Test
    public void publicationYearMedianTest() {
        //Given
        BookA bookA_1 = new BookA("aaaaaaa", "bbbbbbbb", 1990, "bb1111");
        BookA bookA_2 = new BookA("ccccccc", "dddddddd", 1689, "dd2222");
        BookA bookA_3 = new BookA("eeeeeee", "ffffffff", 2010,"ff33333");

        Set<BookA> books = new HashSet<>();
        books.add(bookA_1);
        books.add(bookA_2);
        books.add(bookA_3);

        //When
        MedianAdapter adapter = new MedianAdapter();
        int median = adapter.publicationYearMedian(books);

        //Then
        Assert.assertEquals(1990, median);
    }
}
