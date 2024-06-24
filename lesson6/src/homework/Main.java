package lesson6.src.homework;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        user.report();

        // Новый класс UserPersister - Принципу инверсии зависимостей
        UserPersister persister = new UserPersister(user);
        persister.save();
    }
}