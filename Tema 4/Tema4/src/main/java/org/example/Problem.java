package org.example;

import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.*;


/**
 * Descrie instanta unei probleme de cardinalitate maxima.
 */
public class Problem {

    List<Student> students = new ArrayList<>();
    List<Project> projects = new ArrayList<>();
    List<MutablePair<String, String>> greedy = new ArrayList<>();

    public Problem() {};

    /**
     * Metoda adauga studenti in lista de studenti a problemei.
     * @param student
     */
    public void addStudent(Student student) {
        students.add(student);
    }
    /**
     * Metoda adauga proiecte in lista de proiecte a problemei.
     * @param project
     */
    public void addProject(Project project) {
        projects.add(project);
    }

    /**
     * Metoda afiseaza lista de studenti si numele lor.
     */
    public void getStudents() {
        for(Student s: students) {
            System.out.print(s.toString() + " ");
        }
    }
    /**
     * Metoda afiseaza lista de proiecte si numele lor.
     */
    public void getProjects() {
        for(Project p2: projects) {
            System.out.print(p2.toString() + " ");
        }
    }

    /**
     * Metoda calculeaza si afiseaza sttudentii care au in lista preferintelor un numar de proiecte mai mic decat media.
     */
    void studentsLowPref() {
        int sum = 0;
        for (Student s : students) {
            sum += s.okProjects.size();
        }
        double avgPref = (double) sum / students.size();
        students.stream()
                .filter(s -> s.okProjects.size() < avgPref)
                .forEach(s -> System.out.println(s.name));
    }

    /**
     * Functia calculeaza si afiseaza impartirea proiectelor la studenti utilizand un algoritm greedy.
     * Declaram o lista usedProj unde vom adauga proiecte pe masura ce le atribuim studentilor. Parcurgem lista okProjects de proiecte admisibile a fiecarui
     * student si ii asignam primul proiect intalnit care nu se afla in lista usedProj. Salvam perechile <student, proiect> intr o lista greedy de tip MutablePair.
     */
    public void greedyAlg() {
        List<Project> usedProj = new ArrayList<>();
        for (Student s1 : this.students) {
            System.out.print(s1.toString() + " -> ");
            for (Project p1 : s1.okProjects) {
                if (!usedProj.contains(p1)) {
                    greedy.add(new MutablePair<>(s1.getName(), p1.getName()));
                    usedProj.add(p1);
                    System.out.println(p1.toString());
                    break;

                }
            }
        }
    }


}













