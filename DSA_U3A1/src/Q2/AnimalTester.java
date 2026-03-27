package Q2;

public class AnimalTester {
    public static void main(String[] args) {
        Dog sloppy = new Dog("John", 27, "Terrier");
        Dog slop = new Dog("Tiny", 200, "Bulldog");
        Animal[] one = { slop, sloppy };
        Cat phil = new Cat("Bella", 19, "Calico");
        Cat phatPhil = new Cat("Phil", 46, "Tuxedo");
        Animal[] two = { phil, phatPhil };
        Animal[] three = { phil, slop };
        AnimalCage first = new AnimalCage(one);
        AnimalCage second = new AnimalCage(two);
        if (first.compareWeight(second)) {
            System.out.println("The dogs weigh more than the cats");
        } else {
            System.out.println("The cats weigh more than the dogs");
        }
        for (Animal i : two) {
            System.out.println(i);
        }
        for (Animal i : three) {
            i.speak();
        }
    }
}