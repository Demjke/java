package lesson4.controller;

import java.util.List;

import lesson4.model.Student;
import lesson4.view.StudentView;
import lesson4.view.UserView;

public class StudentController implements UserController<Student> {

    private UserView<Student> view = new StudentView();

    public void sendOnConsole(List<Student> students) {
        view.sendOnConsole(students);
    }

    @Override
    public Student create(Student student) {
        return new Student(student.getId(), student.getName(), student.getLastName());
    }

}