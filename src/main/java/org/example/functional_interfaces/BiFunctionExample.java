package org.example.functional_interfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> studentBiFunction = (studentList, studentPredicate) ->{
        Map<String, Double> studentGrademap = new HashMap<>();
        studentList.forEach(student -> {
            if(studentPredicate.test(student)){
                studentGrademap.put(student.getName(), student.getGpa());
            }
        });
        return studentGrademap;
    };

    public static void main(String[] args) {
        System.out.println(studentBiFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p1));
    }
}
