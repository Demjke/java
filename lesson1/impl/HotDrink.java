package lesson1.impl;

import java.time.LocalDate;
import lesson1.Product;

public class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.temperature = 0;
    }

    public HotDrink(String name, double price, LocalDate releaseDate, int temperature) {
        super(name, price, releaseDate);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" + "name='" + name + '\'' + ", price=" + price + ", releaseDate=" + releaseDate
                + ", temperature=" + temperature + "}";
    }

}
