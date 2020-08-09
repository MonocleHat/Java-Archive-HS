import java.util.Scanner;
public class ChaosTheory {
    public static void main (String [] args){



        double userNum; //User determined value

        int loopCount = 0; //Loop counter variable to count loop iterations
        Scanner userInput = new Scanner (System.in); //Scanner opens
        System.out.println ("Enter a number");
        userNum = userInput.nextDouble(); //gets user input
        while (loopCount != 50){ //While the loop has not repeated 50 times, the loop will run
            userNum = 2* userNum*(1-userNum); //performs the logistic equation for calculating with the chaos theory: x = 2*x(x-1)
            loopCount++;//Increments loop
            System.out.println ("result: " +userNum);
        }
        userInput.close(); //Closes input stream.

    }
}
