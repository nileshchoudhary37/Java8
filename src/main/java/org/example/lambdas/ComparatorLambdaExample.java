package org.example.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /**
         * prior java8
         */
        Comparator<Integer> comparator = new  Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); //o1==02 => return 0
                                         //o1>02 => return 1
                                         //o1<o2 => return -1
            }

        };
        System.out.println("Result of comparator: "+ comparator.compare(3,2));

        /**
         * Comparator using lambda
         */
        Comparator<Integer> comparatorLambda = (a, b) -> a.compareTo(b);
        System.out.println("Result of comparatorLambda: "+ comparatorLambda.compare(3,2));
    }
}
