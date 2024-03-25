package edu.ntudp.chekushkin.view;


import edu.ntudp.chekushkin.model.*;

import java.util.ArrayList;

public class UniversityView {
    public static void printUniversity(University university) {

        System.out.println("University: " + university.getName());
        ArrayList<Faculty> faculties = university.getFaculties();
        for (int i = 0; i < faculties.size(); i++) {
            System.out.print("\t");
            System.out.print((i + 1) + ". ");
            printFaculty(faculties.get(i));
            System.out.println();
        }
    }

    private static void printFaculty(Faculty faculty) {
        System.out.println("Faculty: " + faculty.getName());
        ArrayList<Department> departments = faculty.getDepartments();
        for (int i = 0; i < departments.size(); i++) {
            System.out.print("\t\t");
            System.out.print((i + 1) + ". ");
            printDepartment(departments.get(i));
            System.out.println();
        }
    }

    private static void printDepartment(Department dept) {
        System.out.println("Department: " + dept.getName());
        ArrayList<Group> groups = dept.getGroups();

        for (int i = 0; i < groups.size(); i++) {
            System.out.print("\t\t\t");
            System.out.print((i + 1) + ". ");
            printGroup(groups.get(i));
            System.out.println();
        }
    }

    private static void printGroup(Group group) {
        System.out.println("Group: " + group.getName());
        var students = group.getStudents();

        for (int i = 0; i < students.size(); i++) {
            System.out.print("\t\t\t\t|");
            System.out.print((i + 1) + ". ");
            printStudent(students.get(i));
            System.out.println();
        }
    }

    private static void printStudent(Student student) {
        System.out.print(student.getFullName());
    }
}

