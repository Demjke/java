package lesson5.controller;

import java.util.List;

import lesson5.model.StudentGroup;
import lesson5.model.impl.Student;
import lesson5.model.impl.Teacher;
import lesson5.service.StudentGroupService;

public class StudentGroupController {

    private StudentGroupService service = new StudentGroupService();
    private TeacherController tService = new TeacherController();

    public StudentGroup createStudentGroup(Teacher t, List<Student> s) {
        return service.createStudentGroup(t, s);
    }

    public StudentGroup getStudentGroup(int t, List<Integer> s) {
        return service.getStudentGroup(tService.getById(t), s);
    }

}