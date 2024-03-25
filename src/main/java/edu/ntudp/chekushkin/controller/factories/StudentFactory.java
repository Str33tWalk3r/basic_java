package edu.ntudp.chekushkin.controller.factories;

import edu.ntudp.chekushkin.model.Sex;
import edu.ntudp.chekushkin.model.Student;

import java.util.ArrayList;

public class StudentFactory extends HumanFactory {
    public static ArrayList<Student> create(int count) {
        var result = new ArrayList<Student>(count);

        for (int i = 0; i < count; i++) {
            var head = create();
            result.add(head);
        }

        return result;
    }

    public static Student create() {
        var sex = getRandomSex();
        var result = create(sex);

        return result;
    }

    public static Student create(Sex sex) {
        var firstName = getRandomFirstName(sex);
        var lastName = getRandomLastName(sex);
        var patronymic = getRandomPatronymic(sex);

        var result = new Student(firstName, lastName, patronymic, sex);

        return result;
    }
}
