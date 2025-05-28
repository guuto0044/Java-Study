package com.cursojava.secao18.espressaoLambda.FunctionReceiveFunction.application;

import com.cursojava.secao18.espressaoLambda.FunctionReceiveFunction.entities.Product;
import com.cursojava.secao18.espressaoLambda.FunctionReceiveFunction.service.ProductService;

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
        list.add(new Product("TV",800.0));

        ProductService productService = new ProductService();

        double result = productService.filteredSum(list,product -> product.getName().charAt(0) == 'T');

        System.out.println("Sum = " + result);

    }
}
