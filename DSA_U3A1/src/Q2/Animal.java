package Q2;

public abstract class Animal {

    public abstract void speak();

    private final String name;
    private final String breed;
    private final double weight;

    Animal(String name, double weight, String breed){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " is a " + breed + " and weighs " + weight;
    }

    public double getWeight(){
        return weight;
    }
}
