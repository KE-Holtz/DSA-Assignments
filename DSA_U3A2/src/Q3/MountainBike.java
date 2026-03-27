package Q3;

public class MountainBike extends Cycle {

    private int mud = 0;
    private final int mudTolerance;
    private final int tireWidth;

    public MountainBike(String riderName, String brandName, int mudTolerance, int tireWidth) {
        super(riderName + " - " + brandName, 2);
        this.mudTolerance = mudTolerance;
        this.tireWidth = tireWidth;
    }

    @Override
    public void move() {
        position += 9 + tireWidth / 2 - mud + mudTolerance;
        tirewear += 2;
        mud += (int) (Math.random() * 2);
        if (mud > mudTolerance) {
            tirewear += 10;
        }
    }

    @Override
    public void makePitStop() {
        position -= 15 + 2 * mud;
        tirewear = 0;
        mud = 0;
    }

}
