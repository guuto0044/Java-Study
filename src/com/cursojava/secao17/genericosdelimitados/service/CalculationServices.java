package com.cursojava.secao17.genericosdelimitados.service;

import java.util.List;

public class CalculationServices {

    public static <Type extends Comparable<Type>> Type max(List<Type>list){
//        O metodo (COMPARABLE) vai trabalhar com qualquer tipo
//        'Type' desde que o 'Type' seja subtipo de comparable<Type>>
        if (list.isEmpty()){
            throw new IllegalStateException("List can't be empty!");
        } else {
            Type max = list.getFirst();
            for (Type item : list){
                if (item.compareTo(max) > 0){
                    max = item;
                }
            }
            return max;
        }
    }
}
