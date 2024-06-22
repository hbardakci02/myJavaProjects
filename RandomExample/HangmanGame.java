package RandomExample;

import java.util.Random;
import java.util.Scanner;

import javax.xml.transform.Source;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = { "java", "computer", "something", "other", "final", "yourself", "fuck" };

        Random rand = new Random();
        String wordToGuess = words[rand.nextInt(words.length)];

        boolean[] guessedLetters = new boolean[wordToGuess.length()];

        int remainingGuess = wordToGuess.length();

        System.out.println("Welcome to hangman game: ");
        System.out.println("Be guess to find word: ");

        while (remainingGuess > 0) {
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (guessedLetters[i]) {
                    System.out.print(wordToGuess.charAt(i) + " ");
                } else {
                    System.out.print("_ ");
                }
            }

            System.out.println();
            System.out.println("Remaining guess: " + remainingGuess);
            System.out.println("Enter a letter: ");
            char guess = scan.next().charAt(0);

            boolean isfound = false;

            for (int i = 0; i < wordToGuess.length(); i++) {
                if (guess == wordToGuess.charAt(i)) {
                    guessedLetters[i] = true;
                    isfound = true;
                }
            }

            if (isfound == true) {
                System.out.println("Right guess: ");
                System.out.println();
            } else {
                remainingGuess--;
                System.out.println("Wrong guess: ");
                System.out.println();
            }

            boolean isFinished = true;

            for (boolean element : guessedLetters) {
                if (!element) {
                    isFinished = false;
                    break;
                }
            }
            if (isFinished) {
                System.out.println("Congratulations !!");
                break;
            }

        }
        if (remainingGuess == 0) {
            System.out.println("Game Over: ");
            System.out.println("Word: " + wordToGuess);
        }
    }
}
