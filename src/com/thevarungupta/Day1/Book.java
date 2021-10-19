package com.thevarungupta.Day1;

import java.util.Locale;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void display(){
        System.out.printf("Book : Id = %s, Author = %s, Price = $%.2f%n", title, author, price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Title 1", "Author 1", 100);
        Book book2 = new Book("Title 2", "Author 2", 200.95);

        book1.display();
        book2.display();
    }

}
