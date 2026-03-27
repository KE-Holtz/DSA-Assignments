package Q2;

public abstract class Fruit {
    private double weight;
    private double avgWeight;

    // The weight of a fruit will vary, for example not all apples weigh exactly .33
    // lbs,
    // so we need to model that in this class. In the constructor,
    // calculate exactly what the weight of the fruit will be. It should be
    // ±5% of the average weight. Therefore, the average weight of the fruit should
    // be
    // multiplied by a random real number on the interval [0.95, 1.05).
    public Fruit() {
        this.avgWeight = getAverageWeight();
        weight = avgWeight * (Math.random() * 0.1 + 0.95);
    }

    // return the value that was calculated in the constructor
    public double getWeight() {
        return weight;
    }

    // calculate this value with getWeight() and getPricePerPound()
    public double getPrice() {
        return weight * getPricePerPound();
    }

    public abstract double getPricePerPound();

    public abstract double getAverageWeight();

    public abstract String getName();

    // return a string containing the name, price, and weight.
    // i.e. Watermelon weighs 10.25 pounds and costs $23.45
    // (All values should be rounded to two decimal places.)
    public String toString() {
        return String.format("%s weighs %.2f pounds and costs $%.2f", getName(), getWeight(), getPrice());
    }
}
