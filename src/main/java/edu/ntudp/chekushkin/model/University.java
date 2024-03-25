package edu.ntudp.chekushkin.model;

import java.util.ArrayList;
import java.util.List;

public class University extends BaseUniversityEntity {
    private ArrayList<Faculty> faculties;

    public University(String name, Head head) {
        super(name, head);
        faculties = new ArrayList<>();
    }

    public University(String name, Head head, ArrayList<Faculty> faculties) {
        super(name, head);
        this.faculties = faculties;
    }

    public University(String name, Head head, Faculty... faculties) {
        super(name, head);
        this.faculties = new ArrayList<>(List.of(faculties));
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
}

