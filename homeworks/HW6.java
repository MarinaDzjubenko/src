package homeworks;

public class HW6 {
    public static void main(String[] args) {
        // Write an application, that will print the full latin alphabet
        // (upper case letters) in alphabetical order. Each letter should be printed in new line.
        // Solution 1
        char ch = 'A';
        for (int i = 1; i <= 26; i++) {
            System.out.println(ch ++);
        }

        //Solution 2
        for(char i = 'A'; i<='Z'; i++){
            System.out.println(i);
        }
    }
}



