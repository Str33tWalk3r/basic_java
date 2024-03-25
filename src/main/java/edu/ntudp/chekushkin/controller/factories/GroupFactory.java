package edu.ntudp.chekushkin.controller.factories;

import edu.ntudp.chekushkin.model.Group;
import edu.ntudp.chekushkin.model.Head;
import edu.ntudp.chekushkin.model.Student;

import java.util.ArrayList;

public class GroupFactory {
    public static Group create(String name, int studentsCount) {
        return new Group(name, HeadFactory.create(), StudentFactory.create(studentsCount));
    }

    public Group create(String name) {
        return new Group(name, HeadFactory.create());
    }

    public Group create(String name, Head head) {
        return new Group(name, head);
    }

    public Group create(String name, Head head, ArrayList<Student> students) {
        return new Group(name, head, students);
    }

    public Group create(String name, Head head, Student... students) {
        return new Group(name, head, students);
    }
}

