package com.cursojava.secao18.espressaoLambda.pipeline.application;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 5, 10);

        Stream<Integer> mult = list.stream().map(x -> x * 10);
        System.out.println(mult.toList());


        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println("Sum = " + sum);

        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .toList();
        System.out.println(newList);
    }
}
