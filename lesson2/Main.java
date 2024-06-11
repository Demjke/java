package lesson2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human petr = new Human("Петр");
        Human vasiliy = new Human("Василий");
        Human ludmila = new Human("Людмила");

        Market market = new Market();

        market.acceptToMarket(List.of(petr, vasiliy, ludmila));

        market.giveOrders(petr, List.of(EProduct.POTATO, EProduct.BURGER));
        market.giveOrders(vasiliy, List.of(EProduct.POTATO, EProduct.KOLA));
        market.giveOrder(ludmila, EProduct.KOLA);

        market.update();

        market.releaseFromMarket(petr);
        market.releaseFromMarket(vasiliy);

        market.acceptToMarket(ludmila);
        market.giveOrder(ludmila, EProduct.POTATO);

        market.update();
    }
}
