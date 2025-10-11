package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {
        Predicate<Student> p1 = s -> s.getGradeLevel()>=3;
        Predicate<Student> p2 = s -> s.getGpa()>=3.9;

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .filter(p1)
                .peek(s ->{
                    System.out.println("after 1st filter:");
                    System.out.println(s);
                })
                .filter(p2)
                .peek(s ->{
                    System.out.println("after 2nd filter:");
                    System.out.println(s);
                })
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(studentMap);
    }
}
