package lesson5.com_exzample_uni.controller;

import lesson5.com_exzample_uni.model.impl.Teacher;
import lesson5.com_exzample_uni.service.TeacherService;

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
