package org.example;

import java.util.List;
import java.util.ArrayList;
public class Student implements Comparable<Student> {

    String name;
    List<Project> okProjects = new ArrayList<Project>();

    public Student(String name, List<Project> okProjects) {
        this.name = name;
        this.okProjects = okProjects;

    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }



    @Override
    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student student = (Student) obj;
        return this.name.equals(student.name);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

}