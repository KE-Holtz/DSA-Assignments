package Q1;

public class Cashier extends Employee{

    private final int hourlyWage;
    private final int hoursWorked;

    protected Cashier(String name, String address, int idNumber, int hourlyWage, int hoursWorked) {
        super(name, address, idNumber);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double computePay() {
        return hourlyWage * (double) hoursWorked;
    }


}
