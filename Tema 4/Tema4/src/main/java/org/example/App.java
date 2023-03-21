package org.example;
import com.github.javafaker.Faker;
import org.apache.commons.lang3.tuple.MutablePair;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Random;


public class App {

    public static void main(String[] args) {

        Faker faker = new Faker();

        Problem p1 = new Problem();

       //Cream studentii si proiectele

        var students = IntStream.rangeClosed(1, 3)
                .mapToObj(i -> new Student(faker.name().firstName()))
                .toArray(Student[]::new);


        var projects = IntStream.rangeClosed(1, 3)
                .mapToObj(i -> new Project(faker.commerce().productName()))
                .toArray(Project[]::new);


        Faker faker1 = new Faker();
        Random rand = new Random();
        int count;

        //Adaugam studentii si proiectele in liste
        for (Student s : students) {

            p1.addStudent(s);
        }
        System.out.println("Students:");
        p1.getStudents();


        for(Project p : projects)   {
            p1.addProject(p);
        }

        System.out.println("\nProjects:");
        p1.getProjects();

        //Cream random listele de proiecte admisibile ale fiecarui student
        for (Student s : p1.students) {
            count=0;
            List<Project> copiedList = new ArrayList<>(p1.projects);

                while (count < faker1.number().numberBetween(1, p1.projects.size())) {
                Project randomProj = copiedList.get(rand.nextInt(copiedList.size()));
                copiedList.remove(randomProj);

                if (randomProj != null) {
                    s.addPreference(randomProj);
                    count++;

                }
            }
        }
        //Sortam studentii crescator dupa numarul de proiecte admisibile din lista
        Collections.sort(p1.students, (s1, s2) -> Integer.compare(s1.okProjects.size(), s2.okProjects.size()));


        System.out.println("\nStudents sorted + list of admissible projects:");
                p1.students.forEach(s1 -> System.out.println(s1.name + " - " + s1.okProjects));

        System.out.println("\nStudents + greedy assigned project:");
        p1.greedyAlg();

        System.out.println("\nStudents with number of preferences lower than the average number of preferences:");
        p1.studentsLowPref();




    }
        }

