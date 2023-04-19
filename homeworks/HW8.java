package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter required size of the array");
        int number = scanner.nextInt();

        // Declare empty array in given size
        float [] array = new float[number];
        float total = 0;

        for (int i = 0; i <number; i++) {
            System.out.println("Please enter element number: "+ (i+1));
            array[i] = scanner.nextInt();
            total = total + array[i];

        }
        System.out.println("Average grade: " +total/array.length);
        System.out.println("There was passed " +array.length + " values ");
    }
}
