package Q1;
public class Square extends Rectangle {

    public Square(Double side) {
        super(side, side);
    }
     
    @Override 
    public String getName() {
        return "square";
    }
}
