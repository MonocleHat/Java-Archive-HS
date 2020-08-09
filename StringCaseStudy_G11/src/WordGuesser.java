import java.util.Scanner;
//Author: MonocleHat
//Original Date: 2015-12-01

public class WordGuesser {
    public static void main(String[] args) {

        final String SECRET_WORD = "BRAIN";

        final String FLAG = "!";

        String wordSoFar = "", updatedWord = "";

        String letterGuess, wordGuess = "";

        int numGuesses = 0;

        int playerScore = 100;

        Scanner input = new Scanner(System.in);

        /* begin game */

        System.out.println("WordGuess game.\n");

        for (int i = 0; i < SECRET_WORD.length(); i++) {

            wordSoFar += "-";       //word as dashes

        }


        System.out.println(wordSoFar + "\n");   //display dashes

        /* allow player to make guesses */

        do {

            System.out.print("Enter a letter (" + FLAG + " to guess entire word): ");

            letterGuess = input.nextLine();

            letterGuess = letterGuess.toUpperCase();
            System.out.println ("score: " +playerScore);


            /* increment number of guesses */

            numGuesses += 1;
            playerScore -= 10;


            /* player correctly guessed a letter--extract string in wordSoFar

             * up to the letter guessed and then append guessed letter to that

             * string Next, extract rest of wordSoFar and append after the guessed

             * letter

             */

            if (SECRET_WORD.indexOf(letterGuess) >= 0) {

                updatedWord = wordSoFar.substring(0, SECRET_WORD.indexOf(letterGuess));

                updatedWord += letterGuess;

                updatedWord += wordSoFar.substring(SECRET_WORD.indexOf(letterGuess)+1, wordSoFar.length());

                wordSoFar = updatedWord;

            }



            /* display guessed letter instead of dash */

            System.out.println(wordSoFar + "\n");

        } while (!letterGuess.equals(FLAG) && !wordSoFar.equals(SECRET_WORD) && playerScore > 0 ||!letterGuess.equals(FLAG) && !wordSoFar.equals(SECRET_WORD) && playerScore == 0 );



        /* finish game and display message and number of guesses */

        if (letterGuess.equals(FLAG)) {

            System.out.println("What is your guess? ");

            wordGuess = input.nextLine();

            wordGuess = wordGuess.toUpperCase();

        }

        if (wordGuess.equals(SECRET_WORD) || wordSoFar.equals(SECRET_WORD)) {

            System.out.println("You won!");

        } else {

            System.out.println("Sorry. You lose.");

        }



        System.out.println("The secret word is " + SECRET_WORD);
        if (playerScore < 0){
            System.out.println ("You've made too many guesses");
        }
        else{
            System.out.println("You made " + numGuesses + " guesses.");
        }


    }
}
