package Q1;
public class Circle extends Shape{

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius);
    }

    @Override
    public double getPerimeter() {
        return Math.round(2 * Math.PI * radius);
    }

    @Override
    public String getName() {
        return "circle";
    }

    private final double radius;
    public Circle(double radius){
        this.radius = radius;
    }
}
