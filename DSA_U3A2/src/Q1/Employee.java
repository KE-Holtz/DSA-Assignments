package Q1;
public abstract class Employee {
    private final String name;
    private final String address;
    private final int idNumber;

    protected Employee(String name, String address, int idNumber) {
        this.name = name;
        this.address = address;
        this.idNumber = idNumber;
    }

    public abstract double computePay();

    public void mailCheck() {
        System.out.println(
                "Mailing a check to " + this.name + " at " + this.address + " with a salary of " + this.computePay());
    }

    @Override
    public String toString() {
        return name + " (" + idNumber + ") earns " + computePay();
    }
}
