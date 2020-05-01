import java.util.Random;
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100001);
        System.out.println(numberToGuess); // Number that user has to guess
        double numberOfHints = 0;
        double numberOfGuesses = 0;
        String guess = "";


        System.out.println("Want to win a million dollars?");
        System.out.println("If so, guess the winning number (a number between 0 and 100000).");

        while (true) {
            System.out.println("Insert $1.00 and enter your number or \'q\' to quit:");
            guess = input.nextLine();
            if (guess.equalsIgnoreCase("q")) {
                System.out.println();
                System.out.println("You lost $" + (numberOfHints + numberOfGuesses) + ". Thanks for playing. Come again!");

                break;

            } int numberGuess = Integer.parseInt(guess);
            if (numberGuess == numberToGuess) {
                System.out.println("YOU WIN!");
                break;
            } else {
                numberOfGuesses += 1;
                System.out.println("Sorry, good guess, but not quite right. Do you want me to give you a hint (y|n)?");
                guess = input.nextLine();
                if (guess.equalsIgnoreCase("y")) {
                    System.out.println("Insert $2.00 for the hint!");
                    if (numberGuess < numberToGuess) {
                        System.out.println("Your number is too low!");
                        numberOfHints += 2;

                    } else {
                        System.out.println("Your number is too high!");
                        numberOfHints += 2;
                    }
                }

            }
        }
    }
} //end of Homework2