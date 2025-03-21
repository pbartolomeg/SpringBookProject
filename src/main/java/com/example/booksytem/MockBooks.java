package com.example.booksytem;

import java.util.ArrayList;
import java.util.List;

public class MockBooks {

    public static List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"Don Quijote","Miguel de Cervantes"));
        books.add(new Book(2, "Moby Dick","Herman Melville"));
        books.add(new Book(3, "Gulliver's Travels","Jonathan Swift"));
        books.add(new Book(4, "Little Women","Louisa May Alcott"));
        books.add(new Book(5, "Dracula","Bram Stoker"));
        return books;
    }
}

