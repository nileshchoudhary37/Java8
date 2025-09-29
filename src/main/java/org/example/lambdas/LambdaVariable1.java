package org.example.lambdas;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaVariable1 {
    static int value=4;  //class variable
    int jak=24;  //instance variable

    static Predicate<Integer> p1 = (bok) -> bok>19;

    public static void main(String[] args) {
        int i=1;
        i++;

        Consumer<Integer> consumer = (k) -> {
            System.out.println(k);
//            i++; //not allowed
            value++; //allowed
        };

        System.out.println("check p1.test: "+ p1.test(new LambdaVariable1().jak++));
    }

}
