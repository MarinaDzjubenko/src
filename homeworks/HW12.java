package homeworks;

import java.util.Scanner;

public class HW12 {
    public static void main(String[] args) {
        String str, strrev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a name");
        str = sc.next();
        for (int i = str.length() - 1; i >= 0; i--)
        {
            strrev = strrev + str.charAt(i);
        }
        System.out.println("Reverse of name is: " + strrev);
        if (strrev.equalsIgnoreCase(str)) {
            System.out.println("Entered name is a palindrome");
        } else {
            System.out.println("Entered name is not a palindrome");
        }
    }
}
