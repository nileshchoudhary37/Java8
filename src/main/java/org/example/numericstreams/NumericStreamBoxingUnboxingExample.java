package org.example.numericstreams;

import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingExample {

    public static List<Integer> boxing(){
        return IntStream
                .rangeClosed(1,10)
                //int
                .boxed()
                //Integer
                .toList();
    }

    public static int unboxing(List<Integer> integerList){
        return integerList
                .stream()
                //wrapper integer values
                .mapToInt(Integer::intValue)   //intstream( intValue of the wrapper class)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Boxing: "+boxing());
        System.out.println("Unboxing:"+ unboxing(boxing()));
    }
}
