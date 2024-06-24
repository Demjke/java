package lesson5.model.db;

import java.util.ArrayList;
import java.util.List;

import lesson5.model.impl.Student;
import lesson5.model.impl.Teacher;
import lesson5.model.StudentGroup;
import lesson5.service.TeacherService;

public class dataBase {
    public static final List<Student> studentsDB = new ArrayList<>();
    public static final List<Teacher> teachersDB = new ArrayList<>();
    public static final List<StudentGroup> StudentGroupDB = new ArrayList<>();

    public static void fillDB() {
        Teacher teacher = new Teacher("Иван", "Петров");
        StudentGroup studentGroup = new StudentGroup(teacher);
        TeacherService tService = new TeacherService();
        tService.addGroupId(studentGroup);
        teachersDB.add(teacher);
        Student s1 = new Student(1, "Лидия", "Ломова", 1);
        Student s2 = new Student(2, "Игорь", "Певлин", 1);
        studentsDB.add(s1);
        studentsDB.add(s2);
    }
}
