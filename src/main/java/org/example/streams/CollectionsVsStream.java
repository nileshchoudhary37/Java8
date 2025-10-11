package org.example.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStream {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(); //collections we can add,remove and modify
        names.add("A");
        names.add("B");
        names.add("C");

        names.remove("A");

        System.out.println(names);

        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);

        for(String name : names) {
            System.out.println(name);
        }
        for(String name : names) {
            System.out.println(name);
        }
//        stream.forEach(System.out::println);   //IllegalStateException: stream has already been operated upon or closed
    }
}
