package lesson6.src.srp1;

import lesson6.src.srp1.figure.Point;
import lesson6.src.srp1.figure.Square;
import lesson6.src.srp1.figure.SquareDrawer;
import lesson6.src.srp1.figure.Drawer;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1, 1), 5);
        System.out.printf("Square area: %d \n", square.getArea());
        Drawer drawer = new SquareDrawer(square.getSide());
        drawer.draw();
    }
}