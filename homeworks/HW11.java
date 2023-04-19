package homeworks;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HW11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your personal number");
        String personalNumber = scanner.nextLine();
        if (Pattern.matches("[0-9]{6}-[0-9]{5}", personalNumber)) {
            System.out.println("Your inputted number is valid");
        } else {
            System.out.println("Your inputted personal number is not valid");
        }
        char again = 'y';
        while (again == 'y') {
        }
        System.out.println("Do You want to run again");
        again = scanner.next().charAt(0);
        scanner.nextLine();
    }
}
