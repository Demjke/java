package lesson5.model.impl;

import lesson5.model.User;

public class Student extends User {

    int groupId;

    public Student(int id, String name, String lastName, int groupId) {
        super(name, lastName);
        this.groupId = groupId;
        this.id = id;
    }
}