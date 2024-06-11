package lesson2;

public enum EProduct {

    POTATO("Картошка"),
    BURGER("Бургер"),
    KOLA("Кола");

    private String title;

    EProduct(String string) {
        this.title = string;
    }

    public String getTitle() {
        return title;
    }
}