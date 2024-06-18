package lesson4;

import java.util.ArrayList;

import lesson4.controller.TeatcherController;
import lesson4.controller.TeatchersController;
import lesson4.controller.StudentController;
import lesson4.controller.StudentGroupController;
import lesson4.model.Student;
import lesson4.model.StudentGroup;
import lesson4.service.StudentGroupService;
import lesson4.service.StudentService;
import lesson4.service.TeatcherService;
import lesson4.model.Teatcher;
import lesson4.service.TeatchersService;

public class Program {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        StudentController studentController = new StudentController();

        Student student_1 = studentService.createStudent(1, "Виталий", "Антипов");
        Student student_2 = studentService.createStudent(2, "Екатерина", "Кулажина");
        Student student_3 = studentService.createStudent(3, "Ева", "Тимонина");

        StudentGroup group_1 = new StudentGroup();

        // Добавление студентов в группы
        group_1.students = new ArrayList<>();
        group_1.students.add(student_1);
        group_1.students.add(student_2);
        group_1.students.add(student_3);

        studentController.sendOnConsole(group_1.students);

        StudentGroupService studentGroupService = new StudentGroupService(group_1);
        StudentGroupController groupController = new StudentGroupController(studentGroupService);

        Student updateStudent = studentService.createStudent(1, "Виталий", "Овчинников");
        groupController.update(0, updateStudent);

        TeatcherService teatcherService = new TeatcherService();
        TeatcherController teatcherController = new TeatcherController();
        TeatchersService teatchersService = new TeatchersService();
        TeatchersController teatchersController = new TeatchersController(teatchersService);

        Teatcher teatcher_1 = teatcherService.createTeatcher(1, "Нина", "Николаева");
        Teatcher teatcher_2 = teatcherService.createTeatcher(2, "Людмила", "Богомолова");

        teatchersController.add(teatcher_1);
        teatchersController.add(teatcher_2);

        teatcherController.sendOnConsole(teatchersService.getAllTeatchers());

        Teatcher updateTeatcher = teatcherService.createTeatcher(1, "Нина", "Горшкова");
        teatchersController.update(0, updateTeatcher);

    }
}