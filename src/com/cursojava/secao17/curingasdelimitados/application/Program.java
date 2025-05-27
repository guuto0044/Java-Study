package com.cursojava.secao17.curingasdelimitados.application;

import com.cursojava.secao17.curingasdelimitados.entities.Circle;
import com.cursojava.secao17.curingasdelimitados.entities.Rectangle;
import com.cursojava.secao17.curingasdelimitados.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Shape>listShape = new ArrayList<>();
        listShape.add(new Rectangle(3.0,2.0));
        listShape.add(new Circle(2.0));

        List<Circle>listCircle = new ArrayList<>();
        listCircle.add(new Circle(2.0));
        listCircle.add(new Circle(3.0));

        System.out.println("total = " + totalArea(listCircle)); // totalArea(listShape)
    }

    public static double totalArea(List<? extends Shape>list){
        // Essa lista pode ser Shape ou qualquer tipo que seja
        // subtipo de Shape;
//        list.add(3); (Erro - Não conseguimos adicionar elementos na lista dos métodos.
//        Pois ele não sabe o tipo que o elemento pertence.)
        double sum = 0.0;
        for (Shape s : list){
            sum +=s.area();
        }
        return sum;
    }
}
