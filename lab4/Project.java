package org.example;

import java.util.Comparator;

public class Project implements Comparable<Project> {

    String name;
    public Project(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Project)) return false;
        Project project = (Project) obj;
        return this.name.equals(project.name);
    }

    @Override
    public int compareTo( Project p) {
        return this.name.compareTo(p.name);
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                '}';
    }
}
