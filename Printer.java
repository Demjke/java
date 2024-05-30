import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        // Создание телефонной книги
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add("Иванов", 123456);
        myPhoneBook.add("Петров", 321456);
        myPhoneBook.add("Сидоров", 245456);
        System.out.println(myPhoneBook.find("Иванов"));
        System.out.println(PhoneBook.getPhoneBook());
    }

    // Добавление записи в телефонную книгу, если значение повторяется, то
    // добавляется плюсом к предыдущему
    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> values = new ArrayList<>();
            values.add(phoneNum);
            phoneBook.put(name, values);
        }

    }

    // Поиск значения в телефонной книге по имени
    public ArrayList<Integer> find(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        return new ArrayList<Integer>();
    }

    // Вывод значений отсортированных по убыванию
    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        phoneBook.entrySet().stream()
                .sorted(Entry.comparingByValue())
                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
        return phoneBook;
    }

}
