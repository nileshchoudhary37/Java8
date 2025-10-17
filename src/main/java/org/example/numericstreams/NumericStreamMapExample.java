package org.example.numericstreams;

import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

    public static List<Integer> mapToObject(){
        return IntStream.rangeClosed(1,50)
                .mapToObj((i) -> {
                   return Integer.valueOf(i);
                })
                .toList();
    }

    public static long mapToLong(){
        return IntStream.rangeClosed(1,50)
                .mapToLong(i->i)
                .sum();
    }

    public static double mapToDouble(){
        return IntStream.rangeClosed(1,50)
                .mapToDouble(i->i)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("mapToObject(): "+mapToObject());
        System.out.println("mapToLong(): "+mapToLong());
        System.out.println("mapToDouble(): "+mapToDouble());
    }
}
