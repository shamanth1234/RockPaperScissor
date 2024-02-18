import java.io.*;
import java.util.*;

class RockPaperScissors {
    public static void main(String[] args) {
        String playerChoice, computerChoice, winner;
        Random random = new Random();
        int computerNumber = random.nextInt(3);

        switch (computerNumber) {
            case 0:
                computerChoice = "rock";
                break;
            case 1:
                computerChoice = "paper";
                break;
            case 2:
                computerChoice = "scissors";
                break;
            default:
                computerChoice = "invalid choice";
                break;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice (scissors, rock, paper):");
        playerChoice = sc.next().toLowerCase(); // Read only one word, convert to lowercase

        if (playerChoice.equals(computerChoice)) {
            winner = "Tie";
        } else if (playerChoice.equals("rock") && (computerChoice.equals("scissors"))) {
            winner = "player";
        } else if (playerChoice.equals("scissors") && (computerChoice.equals("paper"))) {
            winner = "player";
        } else if (playerChoice.equals("paper") && (computerChoice.equals("rock"))) {
            winner = "player";
        } else {
            winner = "computer";
        }

        System.out.println("The player chose: " + playerChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println("The winner is: " + winner);
    }
}
