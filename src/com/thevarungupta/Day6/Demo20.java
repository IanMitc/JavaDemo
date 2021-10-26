package com.thevarungupta.Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Demo20 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        // adding product
        productList.add(new Product(1, "Laptop", 20000));
        productList.add(new Product(2, "Mobile", 10000));
        productList.add(new Product(3, "Desktop", 5000));
        productList.add(new Product(4, "Table", 8000));
        productList.add(new Product(5, "Chair", 10000));

        // without stream API
        List<Integer> resultList = new ArrayList<>();
        for (Product product : productList) {
            // filter data of list
            if (product.price > 8000) {
                resultList.add(product.price);  // adding product in the resultlist
            }
        }
        System.out.println(resultList); // display result

        // with stream API
        List<Integer> result =  productList.stream()
                .filter(p -> p.price > 8000) // filtered products
                .map(p -> p.price) // fetch prices
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
