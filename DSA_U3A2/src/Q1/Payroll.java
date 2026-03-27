package Q1;

public class Payroll {
    private final Employee[] employees;

    public Payroll(Employee[] employees){
        this.employees = employees;
    }

    public double weeklyPayroll(){
        double sum = 0;
        for (Employee employee : employees) {
           sum += employee.computePay(); 
        }
        return sum;
    }
}
