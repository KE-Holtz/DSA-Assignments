package Q3;

public class Race {
    public static void main(String[] args) throws Exception {
        Cycle[] cycles = { new Unicycle("Adam"), new Tricycle("Bob"), new MountainBike("Rick", "Huffy", 1, 5),
                new RoadBike("Chris", "Mongoose", 2, 5) };
        startRace(cycles);
    }

    public static void printCycleProgress(Cycle c) {
        System.out.print(c.getName() + ":\n\t\t");
        for (int i = 0; i < c.getPosition() / 5; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void startRace(Cycle[] cycles) throws Exception {
        while (true) {
            try {
                new ProcessBuilder("clear")
                        .inheritIO()
                        .start()
                        .waitFor();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
            for (Cycle c : cycles) {
                c.move();
                printCycleProgress(c);
            }
            for (Cycle c : cycles) {
                if (c.getPosition() >= 200) {
                    System.out.println("\nCycle " + c.getName() + " won!");

                    return;

                }
            }
            Thread.sleep(500);
        }
    }
}
