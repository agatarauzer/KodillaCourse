package com.kodilla.patterns_2.adapter.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    int averagePublicationYear(Map<BookSignature, BookB> books );
    int medianPublicationYear(Map<BookSignature, BookB> books);
}
