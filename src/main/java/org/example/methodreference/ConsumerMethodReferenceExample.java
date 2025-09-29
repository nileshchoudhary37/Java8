package org.example.methodreference;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> studentConsumer = System.out::println;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents()
                .forEach(student ->  studentConsumer.accept(student));
        StudentDataBase.getAllStudents().forEach(Student::printListOfActivities);
    }

}
