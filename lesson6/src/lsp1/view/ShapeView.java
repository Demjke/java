package lesson6.src.lsp1.view;

import lesson6.src.lsp1.shape.Quadrilateral;

public class ShapeView {
    private final Quadrilateral rectangle;

    public ShapeView(Quadrilateral rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {
        System.out.print("Area of quadrilateral equal:");
        System.out.println(rectangle.getArea());
    }
}