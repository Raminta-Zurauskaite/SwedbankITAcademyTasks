package com.swedbank.itacademy;

public class Book {
    private int pages;
    private String Title;

    public Book(int pages, String title) {
        this.pages = pages;
        Title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", Title='" + Title + '\'' +
                '}';
    }
}
