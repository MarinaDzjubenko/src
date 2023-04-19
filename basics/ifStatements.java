package basics;

import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a grade");
        int grade = scanner.nextInt();

        //If
        //Print out "Good job" if grade is over 6
        if (grade > 6) {
            System.out.println("Good job");
        }

        //Print out "You can do better" if grade is less or equal to 4
        if (grade <= 4) {
            System.out.println("You can do better");
        }

        //If Else
        //Print "You have passed the test" if grade is equal or greater than4,
        //but if it' not then print "You have failed the test"

        if (grade >= 4) {
            System.out.println("You have passed the test");
        } else {
            System.out.println("You have failed the test");
        }

        // Same logic
        if (grade < 4) {
            System.out.println("You have failed the test");
        } else {
            System.out.println("You have passed the test");
        }

        //Else if
        // Print comments about grades:
        //1-3 > very bad
        //4-5 > okey
        //6 > nice
        //7-10 > very good
        // If not in the range 1-10 > Invalid input

        if (grade >= 1 && grade <= 3) {
            System.out.println("Very bad");
        } else if (grade == 4 || grade == 5) {
            System.out.println("Okey");
        } else if (grade == 6) {
            System.out.println("Nice");
        } else if (grade > 6 && grade < 11) {
            System.out.println("Very good");
        } else {
            System.out.println("Invalid input");
        }
    }
}





