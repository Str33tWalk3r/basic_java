package edu.ntudp.chekushkin.model;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends BaseUniversityEntity {
    private ArrayList<Department> departments;

    public Faculty(String name, Head head) {
        super(name, head);
        departments = new ArrayList<>();
    }

    public Faculty(String name, Head head, ArrayList<Department> departments) {
        super(name, head);
        this.departments = departments;
    }


    public Faculty(String name, Head head, Department... departments) {
        super(name, head);
        this.departments = new ArrayList<>(List.of(departments));
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }
}
