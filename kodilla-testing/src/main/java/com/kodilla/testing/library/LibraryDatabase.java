package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {
    List<Book> listBooksWithCondition(String titleFragment);

    List<Book> listBooksInHandsOf(Libraryuser libraryuser);

    boolean rentABook(Libraryuser libraryuser, Book book);

    int returnBook(Libraryuser libraryuser);
}
