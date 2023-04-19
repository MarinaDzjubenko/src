package homeworks;

import java.util.Scanner;

public class CallingVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fuel amount in your vehicle");
        float fuel = scanner.nextFloat();

        System.out.println("Enter your vehicle`s fuel usage per 100 km");
        float fuelUsage = scanner.nextFloat();

        System.out.println("Enter how many passengers will be in vehicle");
        int passengers = scanner.nextInt();

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setFuel(fuel);
        vehicle1.setFuelUsage(fuelUsage);
        vehicle1.setPassengers(passengers);

        float result = vehicle1.maxDistance();
        System.out.printf("Your vehicle can drive maximum of %.2f ", result, " kilometers");

        System.out.println();

        System.out.println("Will you turn on air conditioner? y/n");
        char input = scanner.next().toLowerCase().charAt(0);
        boolean airConditioner = false;

        if (input == 'y') {
        } airConditioner = true;
        System.out.println("True");
    }
}
