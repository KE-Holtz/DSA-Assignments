import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        File input = new File("assets/Q1.txt");
        int fuelSumA = Files.lines(input.toPath()).mapToInt(Integer::parseInt).map((x) -> ((x / 3) - 2)).sum();
        System.out.println("Fuel sum A = " + fuelSumA);

        int fuelSumB = Files.lines(input.toPath()).mapToInt(Integer::parseInt).map((x) -> calculateFuel(x)).sum();
        System.out.println("Fuel sum B = " + fuelSumB);

        input = new File("assets/Q2.txt");
        Scanner scanner = new Scanner(input);
        ArrayList<Integer> nums = new ArrayList<>();
        while (scanner.hasNext()) {
            nums.add(scanner.nextInt());
        }
        scanner.close();

        int productA = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            int num1 = nums.get(i);
            for (int j = i + 1; j < nums.size(); j++) {
                int num2 = nums.get(j);
                if (num1 + num2 == 2020) {
                    productA = num1 * num2;
                }
            }
        }

        System.out.println("Product A = " + productA);

        int productB = 0;
        for (int i = 0; i < nums.size() - 2; i++) {
            int num1 = nums.get(i);
            for (int j = i + 1; j < nums.size() - 1; j++) {
                int num2 = nums.get(j);
                for (int k = j + 1; k < nums.size(); k++) {
                    int num3 = nums.get(k);
                    if (num1 + num2 + num3 == 2020) {
                        productB = num1 * num2 * num3;
                    }
                }
            }
        }

        System.out.println("Product B = " + productB);

        input = new File("assets/Q3.txt");
        scanner = new Scanner(input);
        int paperSum = 0;
        int ribbonSum = 0;

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] dimensions = line.split("x");

            int length = Integer.parseInt(dimensions[0]); 
            int width = Integer.parseInt(dimensions[1]); 
            int height = Integer.parseInt(dimensions[2]); 


            int side1 = length * width;
            int side2 = width * height;
            int side3 = height * length;

            ArrayList<Integer> edges = new ArrayList<>();
            edges.add(length);
            edges.add(width);
            edges.add(height);
            Collections.sort(edges);
            
            int smallestSurface = Math.min(side1, Math.min(side2, side3));
            int smallestPerimiter = 2 * (edges.get(0) + edges.get(1));

            paperSum += 2 * side1 + 2 * side2 + 2 * side3 + smallestSurface;
            ribbonSum += smallestPerimiter + length * width * height;
        }
        scanner.close();

        System.out.println("Paper Sum = " + paperSum);
        System.out.println("Ribbon Sum = " + ribbonSum);

        input = new File("assets/Q4.txt");
        String instructions = Files.lines(input.toPath()).collect(Collectors.joining());
        int floor = 0;
        int instructionNum = 0;
        boolean visitedBasement = false;
        for(char c : instructions.toCharArray()){
            instructionNum ++;
            if(c == '('){
                floor += 1;
            } else if (c == ')'){
                floor -= 1;
                if(floor < 0 && !visitedBasement){
                    System.out.println("Entering basement on instruction number " +  instructionNum);
                    visitedBasement = true;
                }
            } else {
                System.out.println("Character " + c + ", expected ( or )");
            }
        }

        System.out.println("Floor = " + floor);

        input = new File("assets/Q5.txt");
        int safeReports = Files.lines(input.toPath()).mapToInt((x) -> isSafe(x)).sum();
        System.out.println("Safe reports: " + safeReports);
    }

    public static int isSafe(String report){
        String[] levelStrs = report.split(" ");
        ArrayList<Integer> levels = new ArrayList<>();
        for(String s : levelStrs){
            levels.add(Integer.parseInt(s));
        }
        ArrayList<Integer> diffs = new ArrayList<>();
        for(int i = 0; i < levels.size() - 1; i++){
            diffs.add(levels.get(i) - levels.get(i+1));
        }
        ArrayList<Integer> secondDiffs = new ArrayList<>();
        boolean increasing = diffs.get(diffs.size() - 1) > 0;
        for(int i = 0; i < diffs.size() - 1; i++){
            if(diffs.get(i) > 0 != increasing){
                return 0;
            }

            secondDiffs.add(diffs.get(i) - diffs.get(i + 1));
        }

        for(int i : secondDiffs){
            if(i > 2){ // Do I need to check neg. 2 also?
                return 0;
            }
        }

        return 1;
    }

    public static int calculateFuel(int mass) {
        int totalFuel = mass / 3 - 2;
        if (totalFuel > 0) {
            return totalFuel + calculateFuel(totalFuel);
        } else {
            return 0;
        }
    }
}
