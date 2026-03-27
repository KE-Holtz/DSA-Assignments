package Q1;
public class Rectangle extends Shape{

    @Override
    public double getArea() {
        return Math.round(side1 * side2);
    }

    @Override
    public double getPerimeter() {
        return Math.round(2 * side1 + 2 * side2);
    }


    private final double side1; 
    private final double side2;
    public Rectangle(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public String getName() {
        return "rectangle";
    }

}
