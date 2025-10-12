package org.example.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

    public static Integer sumOfNNumbers(List<Integer> integers){
        return integers
                .stream()
                .reduce(0, (a,b) -> a+b);
    }

    public static Integer sumOfNNumbersIntStream(){
        return IntStream
                .rangeClosed(1,6)
                //1
                //2
                //3
                //4
                //5
                //6
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Sum of N integers: " + sumOfNNumbers(integers));
        System.out.println("Sum of N numbers using IntStream: " + sumOfNNumbersIntStream());
    }
}
