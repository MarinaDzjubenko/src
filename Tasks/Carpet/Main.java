package Tasks.Carpet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter floor length");
        double length = scanner.nextDouble();

        System.out.println("Please enter floor width");
        double width = scanner.nextDouble();

        //Create floor object
        Floor floor = new Floor(length, width);
        System.out.println("Floor m2: " + floor.getArea());
        double carpetCost = scanner.nextDouble();

        //Create Carpet object
        Carpet carpet = new Carpet (carpetCost);
        System.out.println("Carpet price per m2: " + carpet.getCost());

        //Create Calculator class object and
        //Pass Floor and Carpet class objects as input
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("In total Carpet will cost " + calculator.getTotalCost() + "Eur");
    }
}
