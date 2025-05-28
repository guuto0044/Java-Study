package com.cursojava.secao18.espressaoLambda.Consumer.application;

import com.cursojava.secao18.espressaoLambda.Consumer.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product>list = new ArrayList<>();

        list.add(new Product("Notebook", 900.0));
        list.add(new Product("Tablet", 500.0));
        list.add(new Product("HD - FHS", 90.0));
        list.add(new Product("Mouse Apple", 80.0));

        double percent = 1.1;

        list.forEach(product -> product.setPrice(product.getPrice() * percent));

        for (Product p : list){
            System.out.println(p);
        }
    }
}
