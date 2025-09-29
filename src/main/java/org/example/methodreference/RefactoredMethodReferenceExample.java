package org.example.methodreference;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactoredMethodReferenceExample {

//    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    static Predicate<Student> p1 = RefactoredMethodReferenceExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student student){
        return student.getGradeLevel()>3;
    }

    public static void main(String[] args) {
        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
    }
}
