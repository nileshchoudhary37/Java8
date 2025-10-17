package org.example.streams_terminal;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartitioningByExample {

    public static void partitioningBy_1(){
        Predicate<Student> gpaPredicate = s-> s.getGpa()>=3.9;
        Map<Boolean, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate));
        System.out.println(studentMap);
    }
    public static void partitioningBy_2(){
        Predicate<Student> gpaPredicate = s-> s.getGpa()>=3.9;
        Map<Boolean, Set<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate, toSet()));
        System.out.println(studentMap);
    }

    public static void main(String[] args) {
        System.out.println("partitioningBy_1: ");
        partitioningBy_1();
        System.out.println("partitioningBy_2: ");
        partitioningBy_2();
    }
}
