package OOP;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String userName = scanner.nextLine();

        System.out.println("Please enter your age");
        int userAge = scanner.nextInt();
        System.out.println(userName);

        //parameters
        printName(userName, userAge);
        String answer2 = greetings(userName);
        System.out.println(answer2);

        System.out.println(sum(4,5,6));
    }
    // name = userName
    //age = userAge
    public static void printName(String name, int age) {
        System.out.println("Hello your name is " + name);
        System.out.println("You are " + age + "years old");
        //Input arguments
    }
    public static String greetings(String name) {
        String result = "Hi " + name;
        return result;
    }
    public static int sum (int num1, int num2, int num3){
        return num1+num2+num3;
    }

}


