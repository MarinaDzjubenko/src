package homeworks;

import java.util.Scanner;

public class homerwok2 {
    public static void main(String[] args) {
        // Using scanner read speed in mp/h
        // Calculate and output speed in km/h
        // Example with input 122.7 mp/h
        // Output --> 122.7 mp/h in km/h would be equal to 197.46651

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your speed in mp/h");
        float speedMph = scanner.nextFloat();

        float speedKmph = speedMph * 1.6f;
        System.out.println(speedMph + " mp/h in km/h would be equal to " + speedKmph);
    }
}

