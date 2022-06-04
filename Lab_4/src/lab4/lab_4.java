package lab4;

import java.util.Random;
import java.util.Scanner;

public class lab_4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Welcome to Rock Paper Scissors Lizard Spock...\nMake your choice...");
        String userChoice = keyboard.nextLine();

        while (!userChoice.equalsIgnoreCase("rock") && !userChoice.equalsIgnoreCase("paper") &&
                !userChoice.equalsIgnoreCase("scissors") && !userChoice.equalsIgnoreCase("lizard") &&
                !userChoice.equalsIgnoreCase("spock")) {
            System.out.println("Please enter a valid choice...");
            userChoice = keyboard.nextLine();
        }

        Random rand = new Random();
        int randomNumber = rand.nextInt((5-1) + 1) + 1;
        String computerChoice;
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

        System.out.println(computerChoice);

//        if (userChoice == "Rock") {
//            if (computerChoice == "Lizard" || computerChoice == "Scissors") {
//                System.out.println("You've won the game!");
//            } else if (computerChoice == "Rock") {
//                System.out.println("Draw");
//            } else {
//                System.out.println("You've lost");
//            }
//        }
    }

}
