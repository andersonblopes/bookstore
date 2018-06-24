package com.lopes.java.model;

import java.util.List;

public class Book {

    private final String name;
    private final String author;
    private final List<Category> categories;

    public Book(String name, String author, List<Category> categories) {
        this.name = name;
        this.author = author;
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public List<Category> getCategories() {
        return categories;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", categories=" + categories +
                '}';
    }
}
