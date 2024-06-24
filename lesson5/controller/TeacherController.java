package lesson5.controller;

import lesson5.model.impl.Teacher;
import lesson5.service.TeacherService;

public class TeacherController {
    TeacherService service = new TeacherService();

    public Teacher getById(int id) {

        Teacher teacher = null;
        try {
            teacher = service.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return teacher;
    }

}
