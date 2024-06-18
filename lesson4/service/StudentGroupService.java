package lesson4.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lesson4.model.Student;
import lesson4.model.StudentGroup;

public class StudentGroupService {

    private StudentGroup studentGroup;
    private List<Student> students = new ArrayList<>();

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<Student> sort() {
        Collections.sort(studentGroup.students);
        return studentGroup.students;
    }

    public void addStudent(Student student) {
        studentGroup.students.add(student);
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
}