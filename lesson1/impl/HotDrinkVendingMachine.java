package lesson1.impl;

import java.util.List;

import lesson1.Product;
import lesson1.VendingMachine;

public class HotDrinkVendingMachine extends VendingMachine {
    public HotDrinkVendingMachine() {
        super();
    }

    public HotDrinkVendingMachine(List<Product> products) {
        super(products);
    }

    @Override
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }
}
