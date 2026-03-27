package Q2;

public class Cat extends Animal{

    public Cat(String name, double weight, String breed){
        super(name, weight, breed);
   }

    @Override
    public void speak() {
        System.out.println("I speak by meowing, MEOW!"); 
    }
}
