package edu.ntudp.chekushkin.model;

import java.util.ArrayList;
import java.util.List;

public class Group extends BaseUniversityEntity {
    private ArrayList<Student> students;

    public Group(String name, Head head) {
        super(name, head);
        students = new ArrayList<>();
    }

    public Group(String name, Head head, ArrayList<Student> students) {
        super(name, head);
        this.students = students;
    }

    public Group(String name, Head head, Student... students) {
        super(name, head);
        this.students = new ArrayList<>(List.of(students));
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
