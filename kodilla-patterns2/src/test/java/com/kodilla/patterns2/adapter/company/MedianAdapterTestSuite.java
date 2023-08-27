package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.bookclassifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();
        books.add(new Book("Pani Jeziora", "Andrzej Sapkowski", 1999, "s"));
        books.add(new Book("Big head", "Matrin Angel", 1274 , "a"));
        books.add(new Book("Sprytny lis", "Micheala Broom", 1274, "g"));
        books.add(new Book("Piórnik", "Sylas Fiora", 12, "z"));
        //When
        int mediana = medianAdapter.publicationYearMediana(books);
        //Then
        assertEquals(1274, mediana);

    }
}
