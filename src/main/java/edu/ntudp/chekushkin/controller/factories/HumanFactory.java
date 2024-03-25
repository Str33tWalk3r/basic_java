package edu.ntudp.chekushkin.controller.factories;

import edu.ntudp.chekushkin.model.Sex;

import java.util.ArrayList;
import java.util.Random;

public abstract class HumanFactory {
    private static final ArrayList<String> maleFirstNames = new ArrayList<>();
    private static final ArrayList<String> femaleFirstNames = new ArrayList<>();
    private static final ArrayList<String> maleLastNames = new ArrayList<>();
    private static final ArrayList<String> femaleLastNames = new ArrayList<>();
    private static final ArrayList<String> malePatronymics = new ArrayList<>();
    private static final ArrayList<String> femalePatronymics = new ArrayList<>();
    private static final Random random = new Random();

    static {
        maleFirstNames.add("Dmytro");
        maleFirstNames.add("Yurii");

        femaleFirstNames.add("Anastasiia");
        femaleFirstNames.add("Hanna");

        maleLastNames.add("Sokolovsky");
        maleLastNames.add("Shapka");

        femaleLastNames.add("Shapka");
        femaleLastNames.add("Sokolovskaya");

        malePatronymics.add("Yuriyovich");
        femalePatronymics.add("Yuriyovna");
    }

    protected static Sex getRandomSex() {
        var sex = random.nextInt(2) == 0
                ? Sex.Male
                : Sex.Female;

        return sex;
    }

    protected static String getRandomFirstName() {
        return getRandomFirstName(getRandomSex());
    }

    protected static String getRandomFirstName(Sex sex) {
        var firstName = sex == Sex.Male
                ? maleFirstNames.get(random.nextInt(maleFirstNames.size()))
                : femaleFirstNames.get(random.nextInt(femaleFirstNames.size()));

        return firstName;
    }

    protected static String getRandomLastName() {
        return getRandomLastName(getRandomSex());
    }

    protected static String getRandomLastName(Sex sex) {
        var lastName = sex == Sex.Male
                ? maleLastNames.get(random.nextInt(maleLastNames.size()))
                : femaleLastNames.get(random.nextInt(femaleLastNames.size()));

        return lastName;
    }

    protected static String getRandomPatronymic() {
        return getRandomLastName(getRandomSex());
    }

    protected static String getRandomPatronymic(Sex sex) {
        var patronymic = sex == Sex.Male
                ? malePatronymics.get(random.nextInt(malePatronymics.size()))
                : femalePatronymics.get(random.nextInt(femalePatronymics.size()));

        return patronymic;
    }
}