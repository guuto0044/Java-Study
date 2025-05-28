package com.cursojava.secao18.espressaoLambda.application;

import com.cursojava.secao18.espressaoLambda.entities.Product;

import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {

        List<Product>list = new ArrayList<>();

        list.add(new Product("Notebook",800.0));
        list.add(new Product("Tv",300.0));
        list.add(new Product("Tablet",250.0));

        list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list){
            System.out.println(p);
        }

    }
}
