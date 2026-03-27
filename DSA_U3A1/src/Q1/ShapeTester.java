package Q1;
public class ShapeTester {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 6);
        Shape circle = new Circle(3);
        Shape square = new Square(5.0);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());
        Shape[] shapes = { rectangle, circle, square };
        for (Shape i : shapes) {
            System.out.println(i);
        }
    }
}
