package homeworks;

import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter required size of the array");
        int number = scanner.nextInt();

        // Declare empty array in given size
        int [] array = new int [number];
        int total = 0;

        for (int i = 0; i <number; i++) {
            System.out.println("Please enter element number: "+ (i+1));
            array[i] = scanner.nextInt();
            total = total + array[i];
        }
        System.out.println("Source array: " + Arrays.toString(array));
        System.out.println("Sum of all elements: " +total);
        }
    }

