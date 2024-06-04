package lesson1;

import lesson1.impl.BottleOfWater;
import lesson1.impl.EPackage;
import lesson1.impl.HotDrink;
import lesson1.impl.HotDrinkVendingMachine;
import lesson1.impl.WaterVendingMachine;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));
        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1), true,
                EPackage.GLASS.getMatherial(), 0.5F);
        Product bottle3 = new HotDrink("Кофе", 100, LocalDate.of(2024, 5, 1), 90);
        Product bottle4 = new HotDrink("Чай", 80, LocalDate.of(2024, 5, 1), 90);

        VendingMachine vm = new WaterVendingMachine();
        VendingMachine hdvm = new HotDrinkVendingMachine();

        System.out.println(vm.getProducts());
        vm.initProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2,
                bottle2));
        System.out.println(vm.getProducts());
        vm.getProduct("Родники");
        System.out.println(vm.getProducts());

        System.out.println(hdvm.getProducts());
        hdvm.initProducts(List.of(bottle3, bottle3, bottle4, bottle4));
        System.out.println(hdvm.getProducts());
        hdvm.getProduct("Кофе");
        System.out.println(hdvm.getProducts());

    }
}
