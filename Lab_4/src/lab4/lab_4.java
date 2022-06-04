package lab4;

import java.util.Random;
import java.util.Scanner;

public class lab_4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        boolean playAgain = true;

        while (playAgain == true) {
            System.out.println("Welcome to Rock Paper Scissors Lizard Spock...\nMake your choice...");
            String userChoice = keyboard.nextLine();

            while (!userChoice.equalsIgnoreCase("rock") && !userChoice.equalsIgnoreCase("paper") &&
                    !userChoice.equalsIgnoreCase("scissors") && !userChoice.equalsIgnoreCase("lizard") &&
                    !userChoice.equalsIgnoreCase("spock")) {
                System.out.println("Please enter a valid choice...");
                userChoice = keyboard.nextLine();
            }

            Random rand = new Random();
            int randomNumber = rand.nextInt((5 - 1) + 1) + 1;
            String computerChoice = "";
            if (randomNumber == 1) {
                computerChoice = "Rock";
            } else if (randomNumber == 2) {
                computerChoice = "Paper";
            } else if (randomNumber == 3) {
                computerChoice = "Scissors";
            } else if (randomNumber == 4) {
                computerChoice = "Lizard";
            } else if (randomNumber == 5) {
                computerChoice = "Spock";
            }

            System.out.println("The computer picked " + computerChoice);
            System.out.println("You picked " + userChoice);

            if (userChoice.equalsIgnoreCase("rock")) {
                if (computerChoice == "Rock") {
                    System.out.println("Draw");
                } else if (computerChoice == "Lizard" || computerChoice == "Scissors") {
                    System.out.println("You win");
                } else {
                    System.out.println("You lose...");
                }
            } else if (userChoice.equalsIgnoreCase("paper")) {
                if (computerChoice == "Paper") {
                    System.out.println("Draw");
                } else if (computerChoice == "Rock" || computerChoice == "Spock") {
                    System.out.println("You win");
                } else {
                    System.out.println("You lose...");
                }
            } else if (userChoice.equalsIgnoreCase("scissors")) {
                if (computerChoice == "Scissors") {
                    System.out.println("Draw");
                } else if (computerChoice == "Paper" || computerChoice == "Lizard") {
                    System.out.println("You win");
                } else {
                    System.out.println("You lose...");
                }
            } else if (userChoice.equalsIgnoreCase("lizard")) {
                if (computerChoice == "Lizard") {
                    System.out.println("Draw");
                } else if (computerChoice == "Paper" || computerChoice == "Spock") {
                    System.out.println("You win");
                } else {
                    System.out.println("You lose...");
                }
            } else if (userChoice.equalsIgnoreCase("spock")) {
                if (computerChoice == "Spock") {
                    System.out.println("Draw");
                } else if (computerChoice == "Scissors" || computerChoice == "Rock") {
                    System.out.println("You win");
                } else {
                    System.out.println("You lose...");
                }
            }
            String userPlayAgainInput = "";
            System.out.println("Would you like to play again? Y/N");
            userPlayAgainInput = keyboard.nextLine();
            if (userPlayAgainInput == "Y")
                playAgain = true;
            else if (userPlayAgainInput == "N") {
                playAgain = false;
            } else {
                System.out.println("Please enter Y or N");
            }
        }
    }
}