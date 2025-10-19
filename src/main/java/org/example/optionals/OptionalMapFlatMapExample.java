package org.example.optionals;

import org.example.data.Bike;
import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {
    //filter
    public static void optionalFilter(){
        Optional<Student> studentOptional = Optional.ofNullable(
                StudentDataBase.studentSupplier.get()); //Optional<Student>
        studentOptional
                .filter(s -> s.getGpa()>=3.5)
                .ifPresent(s -> System.out.println(s));
    }

    //map
    public static void optionalMap(){
        Optional<Student> studentOptional = Optional.ofNullable(
                StudentDataBase.studentSupplier.get()
        );

        Optional<String> stringOptional =
                studentOptional
                .filter(s -> s.getGpa()>=3.5)
                .map(Student::getName);
        System.out.println(stringOptional.get());
    }

    //flatmap
    public static void optionalFlatMap(){
        Optional<Student> studentOptional = Optional.ofNullable(
                StudentDataBase.studentSupplier.get()
        );

        Optional<String> bikename = studentOptional
                .filter(s->s.getGpa()>=3.5)  //Optional<Student <Optional<Bike>>
                .flatMap(Student::getBike)  //returns -> Optional<Bike>
                .map(Bike::getName);

        bikename.ifPresent(b -> System.out.println("bike: "+b));
    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
