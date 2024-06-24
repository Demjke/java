package lesson5.com_exzample_uni.model.impl;

import java.util.ArrayList;
import java.util.List;

import lesson5.com_exzample_uni.model.User;
import lesson5.com_exzample_uni.model.db.dataBase;

public class Teacher extends User {

    public final static List<Integer> groups = new ArrayList<>();

    public Teacher(String name, String lastName) {
        super(name, lastName);
        this.id = dataBase.teachersDB.size() + 1;
    }
}
