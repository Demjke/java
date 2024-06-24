package lesson5.com_exzample_uni.controller;

import java.util.List;

import lesson5.com_exzample_uni.model.StudentGroup;
import lesson5.com_exzample_uni.model.impl.Student;
import lesson5.com_exzample_uni.model.impl.Teacher;
import lesson5.com_exzample_uni.service.StudentGroupService;

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