import java.util.Scanner;
public class DigitsDisplay {
    public static void main (String[] args){

        //Declare Variables
        int userNum; //User variable
        int userContain; //Contains value of number remainder
        int FAILSAFE = 0; //Counter prevents infinite loops in "while" loop.
        Scanner userInput = new Scanner (System.in); //Opens input stream

        //program begins
        System.out.println ("Please enter a positive integer ");
        userNum = userInput.nextInt(); //gets user input

        while (userNum != 0 || FAILSAFE < 3){ //Loop opens, condition: program will run as long as the number isnt zero, and as long as it hasnt run more than 3 times.
            userContain = userNum % 10;
            userNum = userNum / 10;
            FAILSAFE++; //For prevention of infinite loops.
            System.out.println(userContain);
        }
        userInput.close();//Closes input stream
    }
}
