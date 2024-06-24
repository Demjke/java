package lesson6.src.homework;

// Принцип единственной ответственности
// интерфейс Persistable для сохранения пользователей - Принцип разделения интерфейсов
public class UserPersister implements Persistable {
    private final User user;

    public UserPersister(User user) {
        this.user = user;
    }

    @Override
    public void save() {
        System.out.println("Сохранение пользователя: " + user.getName());
    }
}