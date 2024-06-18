package lesson4.view;

import java.util.List;

import lesson4.model.User;

public interface UserView<T extends User> {

    void sendOnConsole(List<T> users);

}