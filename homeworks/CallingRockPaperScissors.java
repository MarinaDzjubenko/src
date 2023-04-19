package homeworks;

import java.util.Random;
import java.util.Scanner;

public class CallingRockPaperScissors {
    public static void main(String[] args) {
        rockPaperScissors rockPaperScissors = new rockPaperScissors();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1, please choose: rock, paper or scissors");
        String player1 = scanner.nextLine().toLowerCase().trim();

        // System.out.println("Player 2, please choose: rock, paper or scissors");
        // String player2 = scanner.nextLine().toLowerCase().trim();
        String [] words = {"rock", "paper", "scissors"};
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String player2 = words[randomIndex];
        System.out.println("Computer: " + player2);

        rockPaperScissors.setPlayer1(player1);
        rockPaperScissors.setPlayer2(player2);

        System.out.println(rockPaperScissors.rockPaperScissors(player1, player2));
    }
}
