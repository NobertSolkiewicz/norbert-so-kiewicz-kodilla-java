package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBookWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();
        if (titleFragment.length() < 3) return bookList;

        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;

        bookList = resultList;
        return bookList;
    }
    public List<Book> listBooksInHandsOf(Libraryuser libraryuser) {
        List<Book> bookList = new ArrayList<>();
        Book book = new Book("Secret", "Asdas", 2000);
        if (libraryDatabase.rentABook(libraryuser, book)) {
            bookList.add(book);
        }

        return bookList;
    }
}
