package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

public class StreamMapReduceExample {

    private static int noOfNoteBooks(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> "female".equals(s.getGender()))
                .filter(s -> s.getGpa()>=3.6)
                .map(Student::getNoteBooks)
//                .reduce(0, (a, b) -> a+b );
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println("Note Books:" +  noOfNoteBooks());
    }
}
