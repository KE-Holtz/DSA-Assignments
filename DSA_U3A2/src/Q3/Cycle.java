package Q3;

public abstract class Cycle {
   private final int wheelcount;
   private final String name;

   protected int tirewear = 0;
   protected int position = 0;

   public Cycle(String name, int wheelcount) {
    this.wheelcount = wheelcount;
    this.name = name;
}

   public abstract void move();

   public abstract void makePitStop();

   public void reset() {
      tirewear = 0;
      position = 0;
   }

   public int getWheelcount() {
    return wheelcount;
   }

   public String getName() {
    return name;
   }

   public int getTirewear() {
    return tirewear;
   }

   public int getPosition() {
    return position;
   }
   
}
