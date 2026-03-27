package Q1;

public class Secretary extends Employee{
    private final double salary;

    public Secretary(String name, String address, int idNumber, int wordsPerMinute) {
        super(name, address, idNumber);
        if (wordsPerMinute < 100) {
           salary = 25000/52d; 
        } else if (wordsPerMinute < 150) {
            salary = 28000;
        } else if (wordsPerMinute < 200) {
           salary = 30000; 
        } else {
            salary = 35000;
        }
    }

    @Override
    public double computePay() {
        return salary;
    }

}
