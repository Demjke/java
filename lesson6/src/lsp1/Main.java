package lesson6.src.lsp1;

import lesson6.src.lsp1.shape.Rectangle;
import lesson6.src.lsp1.shape.Quadrilateral;
import lesson6.src.lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        // Quadrilateral rectangle = new Square(5);
        Quadrilateral rectangle = new Rectangle(5, 6);

        System.out.printf("In a Quadrilateral area = ", rectangle.getArea());
        ShapeView view = new ShapeView(rectangle);
        view.showArea();
    }
}
