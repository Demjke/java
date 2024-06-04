package lesson1.impl;

import java.util.List;

import lesson1.Product;
import lesson1.VendingMachine;

public class WaterVendingMachine extends VendingMachine {
    public WaterVendingMachine() {
        super();
    }

    public WaterVendingMachine(List<Product> products) {
        super(products);
    }
}
