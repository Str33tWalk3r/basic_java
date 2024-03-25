package edu.ntudp.chekushkin.controller.factories;

import edu.ntudp.chekushkin.model.Head;
import edu.ntudp.chekushkin.model.Sex;

import java.util.ArrayList;

public class HeadFactory extends HumanFactory {
    public static ArrayList<Head> create(int count) {
        var result = new ArrayList<Head>(count);

        for (int i = 0; i < count; i++) {
            var head = create();
            result.add(head);
        }

        return result;
    }

    public static Head create() {
        var sex = getRandomSex();
        var result = create(sex);

        return result;
    }

    public static Head create(Sex sex) {
        var firstName = getRandomFirstName(sex);
        var lastName = getRandomLastName(sex);
        var patronymic = getRandomPatronymic(sex);

        var result = new Head(firstName, lastName, patronymic, sex);

        return result;
    }
}

