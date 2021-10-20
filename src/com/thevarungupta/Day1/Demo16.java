package com.thevarungupta.Day1;

/**
 * Book - title, author, price
 */

class Book {
    public String title;
    public String author;
    public int price;

    public void dislay(){
        System.out.println("Book : Id = " + title + ", Author = "
                + author + ", Price = " + price);
    }
}


public class Demo16 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Title 1";
        book1.author = "Author 1";
        book1.price = 100;

        Book book2 = new Book();
        book2.title  ="Title 2";
        book2.author  ="Author 2";
        book2.price = 200;


        book1.dislay();
        book2.dislay();

//
//        System.out.println("Book : Id = " + book1.title + ", Author = "
//                + book1.author + ", Price = " + book1.price);
//
//        System.out.println("Book : Id = " + book2.title + ", Author = "
//                + book2.author + ", Price = " + book2.price);

    }
}
