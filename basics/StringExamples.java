package basics;

import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name ");

        String name = scanner.nextLine().toUpperCase().trim();

        // name == "Bob"
        if (name.equals("Bob")) {
            System.out.println("Your name is Bob");
        }else {
            System.out.println("Your name is not Bob");
        }

        // Combine string values
        String text1 = "This is ";
        String text2 = "new text";
        //text1+text2
        String result = text1.concat(text2);
        System.out.println(result);
        System.out.println("In this sentence there are " + result.length() + " characters");

        //IndexOf
        System.out.println(result.indexOf(" is "));
        System.out.println(result.indexOf('x'));

        //charAt()
        System.out.println(result.charAt(0));
        System.out.println(result.charAt(1));
        System.out.println(result.charAt(2));
        System.out.println(result.charAt(3));

        //Replace
        String greeting = "This is holiday time. \nHave a nice holiday";
        System.out.println(greeting.replaceAll("holiday","Christmas"));
        System.out.println(greeting.replaceFirst("holiday", "Easter"));

        //Substring
        String introduction = "Hello there! My name is Bob and !`m 66";
        System.out.println(introduction.substring(3));
        System.out.println(introduction.substring(6, 11));
        System.out.println(introduction.length());

        String bobsAge = introduction.substring(introduction.length()-2).trim();
        System.out.println("Bob is " +bobsAge + " years old");

        int bobsAgeAsInteger = Integer.parseInt(bobsAge);

        if(bobsAgeAsInteger >=18){
            System.out.println("Adult");

        }else {
            System.out.println("Child");
        }
        //Wrapper class
        int temp1 = 36;
        Integer temp2 = 36;
        String intStrValue = "1";
        String floatStrValue = "2.0";
        String doubleStrValue = "2.345667";
        String booleanStrValue = "true";
        String longStrValue = "125678997";
        String charStrValue = "c";

        int intValue = Integer.parseInt(intStrValue);
        float floatValue = Float.parseFloat(floatStrValue);
        double doubleValue = Double.parseDouble(doubleStrValue);
        boolean booleanValue = Boolean.parseBoolean(booleanStrValue);
        long longValue = Long.parseLong(longStrValue);
        char charValue = charStrValue.charAt(0);

    }
}
