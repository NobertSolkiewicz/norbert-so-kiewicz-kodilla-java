package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMediana(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> maps = new HashMap<>();
        for (Map.Entry<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> map : maps.entrySet()) {
            maps.put(new BookSignature("asda"),new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book("Andrzej Sapkowski", "Pani Jeziora", 1998));
            maps.put(new BookSignature("asda"), new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book("Michel Jordan", "Chickago Bulls", 1872));
            maps.put(new BookSignature("asdas"), new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book("Marek Apostoł", "Biblia", 3));
        }
        return medianPublicationYear(maps);
    }
}
