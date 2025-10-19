package org.example.optionals;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {
    //orElse
    public static String optionalOrElse(){
        Optional<Student> optionalStudent = Optional.ofNullable(
                null);
        return optionalStudent.map(Student::getName).orElse("default");

    }

    //orElseGet()
    public static String optionalOrElseGet(){
        Optional<Student> optionalStudent = Optional.ofNullable(
                StudentDataBase.studentSupplier.get());
        return optionalStudent.map(Student::getName).orElseGet( ()-> "default");

    }

    //orElseThrow()
    public static String optionalOrElseThrow(){
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        return optionalStudent.map(Student::getName).orElseThrow( ()->new RuntimeException("No student found"));
    }

    public static void main(String[] args) {

        System.out.println("orElse: "+ optionalOrElse());
        System.out.println("orElseGet: "+ optionalOrElseGet());
        System.out.println("orElseGetThrow: "+ optionalOrElseThrow());
    }
}
