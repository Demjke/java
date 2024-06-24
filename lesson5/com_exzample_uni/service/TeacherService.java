package lesson5.com_exzample_uni.service;

import lesson5.com_exzample_uni.model.StudentGroup;
import lesson5.com_exzample_uni.model.db.dataBase;
import lesson5.com_exzample_uni.model.impl.Teacher;

public class TeacherService {

    private static StudentGroupService studentGroupService = new StudentGroupService();

    public Teacher createTeacher(String name, String lastName) {
        Teacher t = new Teacher(name, lastName);
        dataBase.teachersDB.add(t);
        return t;
    }

    public void addGroupId(StudentGroup s) {
        int id = studentGroupService.getId();
        Teacher.groups.add(id);
    }

    public Teacher getById(int id) throws Exception {
        Teacher teacher = dataBase.teachersDB
                .stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
        return teacher;
    }
}