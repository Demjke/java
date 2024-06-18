package lesson4.controller;

import lesson4.model.User;

public interface UserController<T extends User> {

    public T create(T user);

}