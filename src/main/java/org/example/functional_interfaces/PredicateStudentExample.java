package org.example.functional_interfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> p1= (s) -> s.getGradeLevel()>=3;
    static Predicate<Student> p2= (s) -> s.getGpa()>=3.9;
    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void filterStudentByGradeLevel(){
        System.out.println("filterStudentByGradeLevel with grade level>=3:");
        studentList.forEach(student -> {
            if(p1.test(student)) {
                System.out.println("student: " + student);
            }
        });
    }

    public static void filterStudentByGpa(){
        System.out.println("filterStudentByGpa with GPA>=3.9:");
       studentList.forEach(student -> {
           if(p2.test(student)) {
               System.out.println("student: " + student);
           }
       });
    }

    public static void filterStudent(){
        System.out.println("filterStudent with gpa>=3.9 and gradeLevel>=3:");
        studentList.forEach(student -> {
            if(p1.and(p2).test(student)){
                System.out.println("student: " + student);
            }
        });
        System.out.println("filterStudent with not gpa>=3.9 or not gradeLevel>=3:");
        studentList.forEach(student -> {
            if(p1.or(p2).negate().test(student)){
                System.out.println("student: " + student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudent();
    }
}
