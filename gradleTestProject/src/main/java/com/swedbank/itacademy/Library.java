package com.swedbank.itacademy;

import java.util.List;

public record Library(List<Book> books) {

    public List<Book> getAllBooks() {
        return books;
    }

    public int getNumberOfBooks() {
        return books.size();
    }

    public Book findBook() {
    return null;
    }

    public int getBookWithMostPages() {
        return 0;
    }
}
