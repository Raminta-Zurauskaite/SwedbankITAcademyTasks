package com.swedbank.itacademy;

import java.util.List;

public record Library(List<Book> books) {

    public List<Book> getAllBooks() {
        return books;
    }

    public int getNumberOfBooks() {
        return books.size();
    }

    public Book findBookByTitle(String title) {
        Book foundBook = null;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle() == title) {
                foundBook = books.get(i);
            }
        }
        return foundBook;
    }

    public Book getBookWithMostPages() {
        if (books.isEmpty()) {
            throw new RuntimeException();
        }
        Book bookWithHighestPageCount = books.get(0);

        for (int i = 1; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getPages() > bookWithHighestPageCount.getPages()) {
                bookWithHighestPageCount = book;
            }
        }
        return bookWithHighestPageCount;
    }
}
