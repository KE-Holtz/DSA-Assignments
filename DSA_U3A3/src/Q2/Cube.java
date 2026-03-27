package Q2;

public class Cube implements Sizeable {
    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getVolume() {
        return Math.pow(sideLength, 3);
    }

}
