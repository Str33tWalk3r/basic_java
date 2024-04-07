package edu.ntudp.chekushkin.database;

import edu.ntudp.chekushkin.model.Sex;
import edu.ntudp.chekushkin.model.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DbContext {
    private static final String URL = "jdbc:mysql://localhost:3306/JavaDb";
    private static final String USER = "user";
    private static final String PASSWORD = "admin";
    private static Connection connection;

    public ArrayList<Student> getAllStudents() {
        String sqlQuery = "SELECT * FROM students";

        try (var statement = connection.createStatement();
             var resultSet = statement.executeQuery(sqlQuery)) {

            return readStudents(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Student> getStudentsByBirthMonth(int month) {
        var sqlQuery = "SELECT * FROM students WHERE MONTH(birthdate) = ?";

        try (var statement = connection.prepareStatement(sqlQuery)) {
            statement.setInt(1, month);
            try (var resultSet = statement.executeQuery()) {
                return readStudents(resultSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private ArrayList<Student> readStudents(ResultSet resultSet) {
        var students = new ArrayList<Student>();

        while (true) {
            try {
                if (!resultSet.next()) {
                    break;
                }

                students.add(readStudent(resultSet));
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return students;
    }

    private Student readStudent(ResultSet resultSet) {
        try {
            return new Student(
                    resultSet.getInt("id"),
                    resultSet.getString("firstName"),
                    resultSet.getString("lastName"),
                    resultSet.getString("patronymic"),
                    Sex.fromRawType(resultSet.getInt("sex")),
                    resultSet.getDate("dateOfBirth")
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void connect() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
