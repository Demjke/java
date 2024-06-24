package lesson5.com_exzample_uni.model;

import java.util.List;

import lesson5.com_exzample_uni.model.impl.Student;
import lesson5.com_exzample_uni.model.impl.Teacher;
import lesson5.com_exzample_uni.model.db.dataBase;

public class StudentGroup {

    public static int id;

    public String name;

    public Teacher teacher;
    public static List<Student> students;

    public StudentGroup(Teacher t, List<Student> s) {
        StudentGroup.students = s;
        this.teacher = t;
        StudentGroup.id = dataBase.StudentGroupDB.size() + 1;
    }

    public StudentGroup(Teacher t) {
        this.teacher = t;
        StudentGroup.id = dataBase.StudentGroupDB.size() + 1;
    }
}