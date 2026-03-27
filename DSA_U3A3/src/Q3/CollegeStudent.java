package Q3;

public class CollegeStudent implements Teachable {
    private String name;
    private double gpa;

    public CollegeStudent(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }
}
