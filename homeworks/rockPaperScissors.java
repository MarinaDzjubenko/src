package homeworks;

public class rockPaperScissors {
    private String player1;
    private String player2;
    private String rockPaperScissors;

    public void setPlayer1(String player1) {this.player1 = player1;}
    public void setPlayer2(String player2) {this.player2 = player2;}

    public String rockPaperScissors(String player1, String player2) {
        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";
        if ((player1.equals(paper) && player2.equals(rock)) || (player1.equals(scissors) && player2.equals(paper)) ||
                (player1.equals(rock) && player2.equals(scissors))) {
            System.out.println("Player 1 wins");
        } else if ((player2.equals(scissors) && player1.equals(paper)) || (player2.equals(paper) && player1.equals(rock)) ||
                (player2.equals(rock) && player1.equals(scissors))) {
            System.out.println("Player 2 wins");
        } else {
            System.out.println("TIE");
        }
        return rockPaperScissors;
    }
}





