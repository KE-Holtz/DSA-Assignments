package Q1;

public class Work {
    public static void main() {
        Employee james = new Secretary("Retsim", "1600 Pennsylvania Ave.", 666, 50);
        Employee bro = new Manager("Buddy the Elf", "Santa Clause Lane", 1225, 12);
        Employee money = new Cashier("James Bond", "30 Wellington Square", 5321, 10, 20);
        Employee[] list = { james, bro, money };
        Payroll crew = new Payroll(list);
        System.out.printf("$%.2f\n", crew.weeklyPayroll());
        for (Employee i : list) {
            i.mailCheck();
            System.out.println();
        }
    }
}