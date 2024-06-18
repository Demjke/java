package lesson4.controller;

import java.util.List;

import lesson4.view.TeatcherView;
import lesson4.view.UserView;
import lesson4.model.Teatcher;

public class TeatcherController implements UserController<Teatcher> {

    private UserView<Teatcher> teacherView = new TeatcherView();

    public void sendOnConsole(List<Teatcher> teachers) {
        teacherView.sendOnConsole(teachers);
    }

    @Override
    public Teatcher create(Teatcher teacher) {
        return new Teatcher(teacher.getId(), teacher.getName(), teacher.getLastName());
    }

}