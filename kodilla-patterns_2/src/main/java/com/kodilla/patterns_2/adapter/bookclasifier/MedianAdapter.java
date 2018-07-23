package com.kodilla.patterns_2.adapter.bookclasifier;

import com.kodilla.patterns_2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.patterns_2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns_2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.patterns_2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<BookA> bookASet) {

        Map<BookSignature, BookB> bookSignatureMap = new HashMap<>();

        for (BookA bookA : bookASet) {
            BookSignature signature = new BookSignature(bookA.getSignature());
            BookB book_B = new BookB(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear());
            bookSignatureMap.put(signature, book_B);
        }

        return medianPublicationYear(bookSignatureMap);
    }
}
