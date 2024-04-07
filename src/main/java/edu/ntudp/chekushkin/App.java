package edu.ntudp.chekushkin;

import edu.ntudp.chekushkin.database.DbContext;
import edu.ntudp.chekushkin.model.Student;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        DbContext dbContext = new DbContext();
        dbContext.connect();

        int month = getInt(1, 12);

        var students = dbContext.getStudentsByBirthMonth(month);
        printStudents(students);

        dbContext.closeConnection();
    }

    private static void printStudents(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            var student = students.get(i);
            System.out.println(i + ". " + student.getFullName() + " " + student.getDateOfBirth());
        }
    }

    private static int getInt(int lowerInclusiveBound, int upperInclusiveBound) {
        var succeeded = false;
        var parsedValue = 0;

        while (!succeeded) {
            try {
                parsedValue = input.nextInt();

                if ((upperInclusiveBound != -1 && parsedValue > upperInclusiveBound)
                        || (lowerInclusiveBound != -1 && parsedValue < lowerInclusiveBound)) {
                    throw new ParseException("", 0);
                }

                succeeded = true;
            } catch (Exception e) {
                System.out.println("Try another time");
            }
        }

        return parsedValue;
    }
}
