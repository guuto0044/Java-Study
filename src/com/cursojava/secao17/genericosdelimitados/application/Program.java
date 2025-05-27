package com.cursojava.secao17.genericosdelimitados.application;


import com.cursojava.secao17.genericosdelimitados.model.entities.Products;
import com.cursojava.secao17.genericosdelimitados.service.CalculationServices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Products>list = new ArrayList<>();

        String strPath = "/Users/augustocesarsouza/Documents/exemplo2.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))){ // Abre o arquivo;

            String line = br.readLine(); // Lê a linha do arquivo

            while (line != null){
                String[] fields = line.split(",");
                list.add(new Products(fields[0],Double.parseDouble(fields[1])));
                // Instancia por base das linhas do
                // arquivo e armazena na lista;
                line = br.readLine();
            }

            Products x = CalculationServices.max(list);
            System.out.println("Max: ");
            System.out.println(x);

        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
