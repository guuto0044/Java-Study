package com.cursojava.secao18.espressaoLambda.FunctionReceiveFunction.service;

import com.cursojava.secao18.espressaoLambda.FunctionReceiveFunction.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public ProductService(){

    }

    public double filteredSum(List<Product> list, Predicate<Product> pred){

        double sum = 0.0;
        for (Product p : list){
            if (pred.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }

}
