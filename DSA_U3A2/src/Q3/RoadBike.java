package Q3;

public class RoadBike extends Cycle {

    private final int tireWidth;
    private final int potholeTolerance;

    public RoadBike(String riderName, String brandName, int tireWidth, int potholeTolerance) {
        super(riderName + " - " + brandName, 2);
        this.tireWidth = tireWidth;
        this.potholeTolerance = potholeTolerance;
    }

    @Override
    public void move() {
        position += 20 / tireWidth;
        tirewear += 3;
        if (Math.random() * 8 > potholeTolerance) {
           tirewear += 10; 
        }
    }

    @Override
    public void makePitStop() {
        position -= 20 + 2 * tireWidth;
        tirewear = 0;
    }

}
