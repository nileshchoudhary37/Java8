package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents()
                .stream()
                //adam
                //jenny
                //emily
                .filter((s) -> s.getGpa()>=3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents()
                .stream()
                //adam
                //jenny
                //emily
                .filter((s) -> s.getGpa()>=3.9)
                .findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> optionalStudent = findAnyStudent();
        Optional<Student> optionalFirstStudent = findFirstStudent();
        if(optionalStudent.isPresent()){
            System.out.println("\nFound the student by findAny: "+optionalStudent.get());
        }else{
            System.out.println("\nNo student found" );
        }

        if(optionalFirstStudent.isPresent()){
            System.out.println("\nFound the student by findFirst: "+optionalFirstStudent.get());
        }else{
            System.out.println("\nNo student found");
        }
    }
}
