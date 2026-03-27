package Q2;

public abstract class Apple extends Fruit {
    public abstract String getColor();

    @Override
    public double getPricePerPound() {
        return 1.50;
    }

    @Override
    public double getAverageWeight() {
        return 0.33;
    }

    @Override
    public String toString() {
        return String.format("%s %s weighs %.2f pounds and costs $%.2f", getColor(), getName(), getWeight(), getPrice());
    }
}
