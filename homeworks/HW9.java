package homeworks;

import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter tree size");
        int number = scanner.nextInt();
        int j, k;
        for (int i = 1; i <= number; i++) {

            for (j = i; j < number; j++) {
                System.out.print(" ");
            }
            for (k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
            System.out.println("#");
        }
    }
