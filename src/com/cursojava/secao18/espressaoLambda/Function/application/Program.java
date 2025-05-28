package com.cursojava.secao18.espressaoLambda.Function.application;

import com.cursojava.secao18.espressaoLambda.Function.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product>list = new ArrayList<>();

        list.add(new Product("Notebook", 900.0));
        list.add(new Product("Tablet", 500.0));
        list.add(new Product("HD - FHS", 90.0));
        list.add(new Product("Mouse Apple", 80.0));

        List<String> names = list.stream().map(product -> product.getName().toUpperCase()).toList();

//        names.forEach(System.out::println);

        for (String n : names){
            System.out.println(n);
        }
    }
}
