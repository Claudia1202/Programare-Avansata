package org.example;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Creeaza obiecte de tip Project. Aceste proiecte trebuiesc asignate studentilor. Numele proiectelor sunt alese random cu javafaker.
 */
public class Project  {

    String name;
    public Project(String name) {
        this.name = name;
    }

    /**
     * Metoda atribuie un nume random proiectului, cu javafaker.
     * @return project.name
     */
    public String getName() {
        Faker faker = new Faker();
        return faker.commerce().productName();
    }

    /**
     * Functia cu care afisam proiectele si numele lor.
     * @return string
     */

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                '}';
    }


}
