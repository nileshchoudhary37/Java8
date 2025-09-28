package org.example.functional_interfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> studentFunction = (students) ->{
        Map<String, Double> studentGrademap = new HashMap<>();
        students.forEach(student -> {
            if(PredicateStudentExample.p1.test(student)) {
                studentGrademap.put(student.getName(), student.getGpa());
            }
        });
        return studentGrademap;
    };

    public static void main(String[] args) {
        System.out.println("Map of student name with their gpas: \n"
                + studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
