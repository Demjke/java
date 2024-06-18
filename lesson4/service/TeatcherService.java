package lesson4.service;

import lesson4.model.Teatcher;

public class TeatcherService {

    public Teatcher createTeatcher(int id, String name, String lastName) {
        return new Teatcher(id, name, lastName);
    }

}