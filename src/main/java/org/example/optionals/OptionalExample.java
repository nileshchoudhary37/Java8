package org.example.optionals;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {
    public static Optional<String> getStudentNameOptional(){
        Optional<Student> optionalStudent =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(optionalStudent.isPresent()){
            return optionalStudent.map(Student::getName);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        Optional<String> optionalString= getStudentNameOptional();
        System.out.println(optionalString.orElse(null));
    }
}
