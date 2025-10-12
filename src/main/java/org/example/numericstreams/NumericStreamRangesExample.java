package org.example.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {
    public static void main(String[] args) {
        IntStream integerStream = IntStream.range(1,50);
        System.out.println("\nRange Count:"+ integerStream.count());
        IntStream.range(1,50).forEach((value) -> System.out.print(value+","));
        System.out.println("\nRangeClosed Count:"+ IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach((value) -> System.out.print(value+","));
        System.out.println("\nLongStream RangeClosed Count:"+ LongStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50).forEach((value) -> System.out.print(value+","));
        System.out.println("Printing the range LongStream asDoubleStream:");
        LongStream.range(1,50).asDoubleStream().forEach(value->System.out.print(value+","));
    }
}
