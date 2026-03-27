package Q3;

public class Unicycle extends Cycle {
    private int angle = 45;
    public Unicycle(String riderName) {
        super(riderName, 1);
    }

    @Override
    public void move() {
        tirewear += 8;
        position += Math.abs(angle - 39)/ 39.0 * 18;
        if (angle > 39) {
           angle += Math.random() * 5; 
        } else {
            angle -= Math.random() * 5;
        }
    }

    @Override
    public void makePitStop() {
        position -= 20;
        tirewear = 0;
    }

}
