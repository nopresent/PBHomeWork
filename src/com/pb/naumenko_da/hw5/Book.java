package com.pb.naumenko_da.hw5;

public class Book {
    private String name, author;
    private Integer year;

    public Book(String name, String author, Integer year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return name + " (" + author + ' ' + year + " г.)";
    }

    public String getName() {
        return name;
    }
}
