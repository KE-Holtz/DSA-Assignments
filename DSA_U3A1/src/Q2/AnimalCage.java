package Q2;

public class AnimalCage {
    private Animal[] animals;

    public AnimalCage(Animal[] animals){
        this.animals = animals;
    }

    public double totalWeight() {
        double total = 0;
        for (Animal animal : animals) {
            total += animal.getWeight();
        }
        return total;
    }

    boolean compareWeight(AnimalCage other){
        return totalWeight() > other.totalWeight();
    }
}
