package VisitorPattern;

public class Main {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();

        drawing.addShape(new Circle(10));
        drawing.addShape(new Rectangle(20, 30));
        drawing.addShape(new Triangle(12, 10));

        drawing.calculateAreas();
    }
}
