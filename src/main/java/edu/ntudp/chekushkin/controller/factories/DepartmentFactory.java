package edu.ntudp.chekushkin.controller.factories;

import edu.ntudp.chekushkin.model.Department;
import edu.ntudp.chekushkin.model.Head;
import edu.ntudp.chekushkin.model.Group;

import java.util.ArrayList;

public class DepartmentFactory {
    public static Department create(String name) {
        return new Department(name, HeadFactory.create());
    }

    public static Department create(String name, Head head) {
        return new Department(name, head);
    }

    public static Department create(String name, Head head, ArrayList<Group> faculties) {
        return new Department(name, head, faculties);
    }

    public static Department create(String name, Head head, Group... groups) {
        return new Department(name, head, groups);
    }
}
