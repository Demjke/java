package lesson5.model.impl;

import java.util.ArrayList;
import java.util.List;

import lesson5.model.User;
import lesson5.model.db.dataBase;

public class Teacher extends User {

    public final static List<Integer> groups = new ArrayList<>();

    public Teacher(String name, String lastName) {
        super(name, lastName);
        this.id = dataBase.teachersDB.size() + 1;
    }
}
