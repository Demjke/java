package lesson4.model;

public class Teatcher extends User {

    public Teatcher(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Учитель [ID: " + id + ", Имя: " + name + ", Фамилия: " + lastName + "]";
    }
}