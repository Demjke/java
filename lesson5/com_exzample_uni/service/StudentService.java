package lesson5.com_exzample_uni.service;

import java.util.List;

import lesson5.com_exzample_uni.model.db.dataBase;
import lesson5.com_exzample_uni.model.impl.Student;

public class StudentService {
    public Student createStudent(int id, String name, String lastName, int idgroup) {
        Student student = new Student(id, name, lastName, idgroup);
        dataBase.studentsDB.add(student);
        return student;
    }

    public Student getById(int id) throws Exception {
        Student student = dataBase.studentsDB
                .stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
        return student;
    }

    public List<Student> getAllStudents() {
        return dataBase.studentsDB;
    }
}
