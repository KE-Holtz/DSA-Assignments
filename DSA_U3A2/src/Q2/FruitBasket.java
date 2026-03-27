package Q2;

public class FruitBasket {
    private static final int CAPACITY = 10;
    private static final double TAX_RATE = 0.08;

    private int fruitCount = 0;
    private Fruit[] list = new Fruit[CAPACITY];

    // add a fruit into the array at the index of fruitCount. If the number
    // of fruit in the basket is equal to the capacity then return false
    // because the fruit cannot be added. Otherwise, return true
    public boolean add(Fruit fruit) {
        if (fruitCount == CAPACITY) {
            return false;
        }
        list[fruitCount] = fruit;
        fruitCount++;
        return true;
    }

    // return the number of fruit that are in the basket
    public int getFruitCount() {
        return fruitCount;
    }

    // return the sum of the price of all the fruits, don’t include tax
    public double getSubtotal() {
        double subtotal = 0;
        for (int i = 0; i < fruitCount; i++) {
            subtotal += list[i].getPrice();
        }
        return subtotal;
    }

    // return the total price, including the tax
    public double getTotal() {
        return getSubtotal() + (getSubtotal() * TAX_RATE);
    }

    // return a string containing all the fruits, as well as the subtotal and the
    // total
    @Override
    public String toString() {
        String str = "";
        for (Fruit fruit : list) {
            if (fruit!= null) {
            str += fruit + "\n";
            }
        }
        str += "Subtotal: $" + String.format("%.2f", getSubtotal()) + "\n";
        str += "Total: $" + String.format("%.2f", getTotal());
        return str;
    }
}
