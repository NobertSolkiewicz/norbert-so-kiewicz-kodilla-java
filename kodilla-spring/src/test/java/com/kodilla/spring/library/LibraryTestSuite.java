package com.kodilla.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class LibraryTestSuite {
    @Autowired
    private Library library;

    @Test
    void testLoadFromDb() {
        //Given
        //When
        library.loadToDb();
        //Then
        //do nothing
    }

    @Test
    void testSaveFromDb() {
        //Given
        //When
        library.saveToDb();
        //Then
        //do nothing
    }

}
