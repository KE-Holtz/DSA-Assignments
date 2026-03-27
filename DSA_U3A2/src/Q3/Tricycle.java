package Q3;

public class Tricycle extends Cycle{

    public Tricycle(String riderName) {
        super(riderName, 3);
    }

    @Override
    public void move() {
        tirewear += 1;
        position += 10;
    }

    @Override
    public void makePitStop() {
        position -= 20;
        tirewear = 0;
    }

}
