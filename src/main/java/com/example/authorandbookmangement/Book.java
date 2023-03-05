package com.example.authorandbookmangement;

public class Book {
    private String bookName;
    private int pages;
    private String AuthorName;

    public Book(String bookName, int pages, String authorName) {
        this.bookName = bookName;
        this.pages = pages;
        AuthorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }
}
