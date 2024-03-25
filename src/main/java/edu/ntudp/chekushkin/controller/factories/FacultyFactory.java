package edu.ntudp.chekushkin.controller.factories;

import edu.ntudp.chekushkin.model.Department;
import edu.ntudp.chekushkin.model.Faculty;
import edu.ntudp.chekushkin.model.Head;

import java.util.ArrayList;

public class FacultyFactory {
    public static Faculty create(String name) {
        return new Faculty(name, HeadFactory.create());
    }

    public static Faculty create(String name, Head head) {
        return new Faculty(name, head);
    }

    public static Faculty create(String name, Head head, ArrayList<Department> departments) {
        return new Faculty(name, head, departments);
    }

    public static Faculty create(String name, Head head, Department... departments) {
        return new Faculty(name, head, departments);
    }
}
