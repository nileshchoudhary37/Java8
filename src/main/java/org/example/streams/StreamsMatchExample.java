package org.example.streams;

import org.example.data.StudentDataBase;

public class StreamsMatchExample {

    public static boolean allMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
                .allMatch(s -> s.getGpa()>=3.5);
    }

    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
                .anyMatch(s -> s.getGpa()>=3.9);
    }

    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
                .noneMatch(s -> s.getGpa()>=4.1);
    }

    public static void main(String[] args) {
        System.out.println("\nResult of all Match: "+allMatch());
        System.out.println("\nResult of anyMatch: "+anyMatch());
        System.out.println("\nResult of noneMatch: "+noneMatch());
    }
}
