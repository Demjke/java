package lesson5.com_exzample_uni.model.impl;

import lesson5.com_exzample_uni.model.User;

public class Student extends User {

    int groupId;

    public Student(int id, String name, String lastName, int groupId) {
        super(name, lastName);
        this.groupId = groupId;
        this.id = id;
    }
}