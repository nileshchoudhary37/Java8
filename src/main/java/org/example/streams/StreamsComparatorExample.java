package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByName(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .toList();
    }

    public static List<Student> sortStudentsByGpa(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .toList();
    }
    public static List<Student> sortStudentsByGpaDesc(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .toList();
    }

    public static void main(String[] args) {
        System.out.println("Students sorted by their names:");
        sortStudentsByName().forEach(System.out::println);
        System.out.println("Students sorted by their Gpa:");
        sortStudentsByGpa().forEach(System.out::println);
        System.out.println("Students sorted by their Gpa DESC:");
        sortStudentsByGpaDesc().forEach(System.out::println);
    }
}
