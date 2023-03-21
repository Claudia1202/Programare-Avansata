package org.example;

import com.github.javafaker.Faker;
import java.util.List;
import java.util.ArrayList;

/**
 * Creeaza obiecte de tip Student. Fiecare student are o lista de proiecte admisibile, de unde va primi un singur proiect.
 * Studentii primesc nume random cu javafaker.
 */
public class Student  {

    String name;
     List<Project> okProjects = new ArrayList<Project>();

    public Student(String name) {
        this.name = name;

    }
/**
 * Functia cu care atribuim nume random studentilor, cu javafaker.
 */
    public String getName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    /**
     * Functia cu care adaugam proiecte admisiblie in lista fiecarui student.
     * @param project
     */
    public void addPreference(Project project) {
        okProjects.add(project);
    }

    /**
     * Functia cu care afisam studentii si numele lor.
     * @return string
     */
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }





}