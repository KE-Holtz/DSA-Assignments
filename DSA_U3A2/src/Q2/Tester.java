package Q2;

public class Tester {
/**
 * Now write a tester class to add all the different Fruits that you made to a FruitBasket and then call the toString method from
the FruitBasket class. Below is a sample output from my program where I added 3 fruits to the basket.
Watermelon weighs 5.11 pounds and costs $3.06
Granny Smith, is green, weighs 0.34 pounds and costs $0.51
Braeburn, is red, weighs 0.33 pounds and costs $0.50
Subtotal: $4.07
Total: $4.40
 */

    public static void main(String[] args) {
        FruitBasket basket = new FruitBasket();
        basket.add(new Watermelon());
        basket.add(new GrannySmith());
        basket.add(new Lemon());
        System.out.println(basket);
    }
}
