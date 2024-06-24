package lesson5.controller;

import java.util.List;

import lesson5.model.db.dataBase;
import lesson5.model.impl.Student;
import lesson5.service.StudentService;

public class StudentController {

    private StudentService service = new StudentService();

    public Student createStudent(String name, String lastName, int idgroup) {
        int id = dataBase.StudentGroupDB.size() + 1;
        return service.createStudent(id, name, lastName, idgroup);

    }

    public Student getById(int id) {

        Student student = null;
        try {
            student = service.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return student;
    }

    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }
}