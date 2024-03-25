package edu.ntudp.chekushkin.model;

import java.util.ArrayList;
import java.util.List;

public class Department extends BaseUniversityEntity {
    private ArrayList<Group> groups;

    public Department(String name, Head head) {
        super(name, head);
        groups = new ArrayList<>();
    }

    public Department(String name, Head head, ArrayList<Group> groups) {
        super(name, head);
        this.groups = groups;
    }

    public Department(String name, Head head, Group... groups) {
        super(name, head);
        this.groups = new ArrayList<>(List.of(groups));
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }
}
