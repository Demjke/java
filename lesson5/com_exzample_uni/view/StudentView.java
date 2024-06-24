package lesson5.com_exzample_uni.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lesson5.com_exzample_uni.controller.StudentController;
import lesson5.com_exzample_uni.controller.StudentGroupController;
import lesson5.com_exzample_uni.model.StudentGroup;
import lesson5.com_exzample_uni.model.db.dataBase;
import lesson5.com_exzample_uni.model.impl.Student;

public class StudentView {
    private StudentController controller = new StudentController();
    private StudentGroupController sGroupController = new StudentGroupController();

    public void start() {
        dataBase.fillDB();
        Scanner scaner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - создать студента");
            System.out.println("2 - найти студжента по id");
            System.out.println("3 - распечатать информацию о всех студентах");
            System.out.println("4 - создать и распечатать группу по id");
            System.out.println("5 - выход");

            switch (scaner.nextInt()) {
                case 1 -> createStudent();
                case 2 -> getById();
                case 3 -> getAllStudents();
                case 4 -> getStudentGroup();
                case 5 -> System.exit(0);// выход из приложения

                default -> System.out.println("Операция не поддерживается");
            }
        }

    }

    private Student createStudent() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scaner.nextLine();
        System.out.println("Введите фамилию:");
        String lastName = scaner.nextLine();
        System.out.println("Введите номер группы:");
        int groupId = scaner.nextInt();
        Student student = controller.createStudent(name, lastName, groupId);
        System.out.println(student);
        return student;

    };

    private Student getById() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите id пользователя: ");
        int id = scaner.nextInt();
        Student student = controller.getById(id);
        System.out.println(student);
        return student;
    };

    private List<Student> getAllStudents() {
        List<Student> students = controller.getAllStudents();
        System.out.println(students);
        return students;
    };

    private StudentGroup getStudentGroup() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите id преподователя");
        int tId = scaner.nextInt();
        List<Integer> sc = new ArrayList<>();
        System.out.println("Введите колличество студентов:");
        int count = scaner.nextInt();
        System.out.println("Введите id студента");
        for (int i = 0; i != count; i++) {
            sc.add(scaner.nextInt());

        }
        return sGroupController.getStudentGroup(tId, sc);
    }
}
