package com.cursojava.exrciciosRecaptular.arquivos.ex1.application;

import com.cursojava.exrciciosRecaptular.arquivos.ex1.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product>products = new ArrayList<>();

        String path = "/Users/augustocesarsouza/Documents/exemplo3.txt";
        String newPath = "/Users/augustocesarsouza/Documents/summary.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while(line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);
                Integer quantity = Integer.parseInt(fields[2]);
                Product product = new Product(name, price, quantity);
                products.add(product);
                line = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(newPath))){
                for (Product p : products){
                    bw.write(p.getName() + "," + p.getPrice());
                    bw.newLine();
                }
                System.out.println("Created...");
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
