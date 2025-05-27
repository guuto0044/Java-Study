package com.cursojava.exrciciosRecaptular.arquivos.ex2.application;

import com.cursojava.exrciciosRecaptular.arquivos.ex2.entities.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Employee>employees = new ArrayList<>();

//        String path  = "/Users/augustocesarsouza/Documents/employee/employees.txt";
        System.out.println("Subcribe a URL and create a file(.txt): ");
        String path = sc.nextLine();

        File creatPath = new File(path);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(creatPath))){

            System.out.print("How many Emplooye's is join: ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++){

                System.out.print("Name of the Employee " + (i+1) + ": ");
                String name = sc.next();

                sc.nextLine();

                System.out.print("Salary: " );
                Double salary = sc.nextDouble();

                System.out.print("Bonus: ");
                Double bonus = sc.nextDouble();

                System.out.println();

                Employee employee = new Employee(name,salary,bonus);

                employees.add(employee);
            }

            for (Employee e : employees){
                bw.write(e.getName() + "," + e.getBaseSalary() + "," + e.getBonus());
                bw.newLine();
            }

            System.out.println("Created a Employee's file...");

            double totalValue;

            try (BufferedReader br = new BufferedReader(new FileReader(creatPath))){
                String line = br.readLine();

                while (line != null) {
                    String[] fields = line.split(",");
                    String name = fields[0];
                    Double salary = Double.parseDouble(fields[1]);
                    Double bonus = Double.parseDouble(fields[2]);
                    employees.add(new Employee(name, salary, bonus));
                    line = br.readLine();
                }
                for (Employee e : employees){
                    totalValue = e.getBaseSalary() + e.getBonus();
                    System.out.println(e.getName() + "," + totalValue);
                }
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
