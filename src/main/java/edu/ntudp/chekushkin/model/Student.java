package edu.ntudp.chekushkin.model;

import java.util.Date;

public class Student extends Human {
    private int id;
    private Date dateOfBirth;

    public Student(String firstName, String lastName, String patronymic, Sex sex) {
        super(firstName, lastName, patronymic, sex);
    }

    public Student(int id, String firstName, String lastName, String patronymic, Sex sex, Date dateOfBirth) {
        super(firstName, lastName, patronymic, sex);
        this.id = id;
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
