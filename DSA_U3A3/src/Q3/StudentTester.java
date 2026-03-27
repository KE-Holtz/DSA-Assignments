package Q3;

import java.util.Arrays;

public class StudentTester {
    public static void main(String[] args) {
        Teachable[] students = { new HighSchooler("Bob", 3.8),
                new CollegeStudent("Stevie", 3.1),
                new CollegeStudent("Adam", 4.0) };

        // Should print out Bob
        System.out.println(greaterGPA(students[0], students[1]));
        // Should print out Adam
        System.out.println(greaterGPA(students[1], students[2]));
        // Should print out Adam
        System.out.println(greaterGPA(students[0], students[2]));
        // Should print out 4.0
        System.out.println(findMax(students).getGPA());
    }

    // If one has a greater GPA than two, it should return the name of Student one.
    // If two is greater than one, it should return the name of Student two.
    // If they have the same GPA it should return “They have the same GPA!”.
    public static String greaterGPA(Teachable one, Teachable two) {
        if (one.getGPA() > two.getGPA()) {
            return one.getName();
        } else if (two.getGPA() > one.getGPA()) {
            return two.getName();
        } else {
            return "They have the same GPA!";
        }
    }

    // If there are no students, then the method should return null.
    // Otherwise, return the Student who has the highest GPA.
    public static Teachable findMax(Teachable[] students) {
        if (students.length == 0) {
            return null;
        }
        Teachable max = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGPA() > max.getGPA()) {
                max = students[i];
            }
        }
        return max;
    }
}