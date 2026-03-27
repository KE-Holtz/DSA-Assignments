package Q1;
public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String getName();
    @Override
    public String toString() {
        return "The perimiter of the " + getName() + " is " + getPerimeter() + " and the area is " + getArea();
    }
}
