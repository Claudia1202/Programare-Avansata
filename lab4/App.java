package org.example;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collector;
import java.util.stream.Stream;


public class App {

    public static void main(String args[]) {

        var students= Stream.of(
                new Student("S1", Arrays.asList(new Project("P1"), new Project("P2"), new Project("P3"))),
                new Student("S2", Arrays.asList(new Project("P1"), new Project("P2"))),
                new Student("S3", Arrays.asList(new Project("P1")))
                ).toList();



        List<Student> studenti = new LinkedList<>(students);



        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student.getName());
        }

    }
}
