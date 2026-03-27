package Q2;

public class Dog extends Animal{


    public Dog(String name, double weight, String breed){
        super(name, weight, breed);
    }

    @Override
    public void speak() {
        System.out.println("I speak by barking, WOOF!"); 
    }

}
