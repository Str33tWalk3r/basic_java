 package edu.ntudp.chekushkin.controller.factories;


import edu.ntudp.chekushkin.model.Faculty;
import edu.ntudp.chekushkin.model.Head;
import edu.ntudp.chekushkin.model.University;

import java.util.ArrayList;

public class UniversityFactory {
    public static University createTypicalUniversity() {
        var university = create("NTU");

        var faculty1 = FacultyFactory.create("Faculty 1");
        university.addFaculty(faculty1);

        var dept1 = DepartmentFactory.create("Dept 1");
        faculty1.addDepartment(dept1);

        var group11 = GroupFactory.create("Group 1-1", 19);
        dept1.addGroup(group11);
        var group12 = GroupFactory.create("Group 1-2", 21);
        dept1.addGroup(group12);

        var dept2 = DepartmentFactory.create("Dept 2");
        faculty1.addDepartment(dept2);

        var group21 = GroupFactory.create("Group 2-1", 17);
        dept2.addGroup(group21);
        var group22 = GroupFactory.create("Group 2-2", 22);
        dept2.addGroup(group22);

        var faculty2 = FacultyFactory.create("Faculty 2");
        university.addFaculty(faculty2);

        var dept3 = DepartmentFactory.create("Dept 3");
        faculty2.addDepartment(dept3);

        var group31 = GroupFactory.create("Group 3-1", 21);
        dept3.addGroup(group31);
        var group32 = GroupFactory.create("Group 3-2", 19);
        dept3.addGroup(group32);

        return university;
    }

    public static University create(String name) {
        return new University(name, HeadFactory.create());
    }

    public static University create(String name, Head head) {
        return new University(name, head);
    }

    public static University create(String name, Head head, ArrayList<Faculty> faculties) {
        return new University(name, head, faculties);
    }

    public static University create(String name, Head head, Faculty... faculties) {
        return new University(name, head, faculties);
    }
}

