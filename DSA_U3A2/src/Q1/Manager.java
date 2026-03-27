package Q1;

public class Manager extends Employee {
    private final double salary;

    public Manager(String name, String address, int idNumber, int yearsOfExperience) {
        super(name, address, idNumber);
        if (yearsOfExperience <= 5) {
            salary = 50000 / 52d;
        } else if (yearsOfExperience <= 7) {
            salary = 60000 / 52d;
        } else{
            salary = 75000/52d;
        }
    }

    @Override
    public double computePay() {
        return salary;
    }

}
