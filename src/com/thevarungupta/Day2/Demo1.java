package com.thevarungupta.Day2;

class Book{
    public String title;
    public String author;
    public int price;

    public  Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display(){
        System.out.println("Book: Title = "+ title+", Author = "+ author+ ", Price = "+ price);
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Book book1 = new Book("Title 1", "Author 1", 100);
        book1.display();

        Book book2 = new Book("Title 2", "Author 2", 200);
        book2.display();
    }
}
