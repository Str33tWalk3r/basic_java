package edu.ntudp.chekushkin.model;

public abstract class BaseUniversityEntity {
    private String name;
    private Head head;

    public BaseUniversityEntity(String name, Head head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }
}

