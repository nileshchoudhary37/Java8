package org.example.parallelstream;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {
    public static int sequentialSum(List<Integer> integers){
        long startTime = System.currentTimeMillis();
        int sum = integers
                .stream()
                .reduce(0, (x, y) -> x + y);
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Duration in sequential stream sum: "+duration);
        return sum;
    }
    public static int parallelSum(List<Integer> integers){
        long startTime = System.currentTimeMillis();
        int sum = integers
                .parallelStream()
                .reduce(0, (x, y) -> x + y);
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Duration in parallel stream sum: "+duration);
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integerList = IntStream
                .rangeClosed(1, 10000)
                .boxed()
                .toList();
        sequentialSum(integerList);
        parallelSum(integerList);
    }
}
