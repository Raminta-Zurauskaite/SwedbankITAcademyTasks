package com.swedbank.itacademy;

import java.util.List;

public record Library(List<Book> books) {

    public List<Book> getAllBooks() {
        return books;
    }

    public int getNumberOfBooks() {
        return books.size();
    }

    public String findBookByTitle(String title) {
        Book foundBook = null;
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).title() == title){
                foundBook = books.get(i);
            }
        }
        return String.valueOf(foundBook);
    }

    public Book getBookWithMostPages() {
       return null;
    }
}
