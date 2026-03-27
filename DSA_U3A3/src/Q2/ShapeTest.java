package Q2;

public class ShapeTest {
    public static void main(String[] args) {
        Sizeable[] shapes = new Sizeable[4];
        shapes[0] = new Cube(3);
        shapes[1] = new Sphere(2);
        shapes[2] = new Cube(4);
        shapes[3] = new Sphere(3);
        printVolume(shapes);
    }

    // printVolume() should print out the largest volume from list
    public static void printVolume(Sizeable[] list) {
        double maxVolume = Double.MIN_VALUE;
        for (Sizeable shape : list) {
            double volume = shape.getVolume();
            if (volume > maxVolume) {
                maxVolume = volume;
            }
        }
        System.out.println("The largest volume is: " + maxVolume);
        // implementation of method goes here
    }
}