import java.util.Scanner;
public class PrimeFactors {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Variables
        int primeCounter = 2;
        int userNum; //Number given by user

        Scanner userInput = new Scanner (System.in); //Scanner open
        System.out.println ("Please enter a number");
        userNum = userInput.nextInt(); //Gets user input

        while (primeCounter <= userNum){ //While loop begins. Loop runs as long as user num is greater or equal to primeCounter.
            if (userNum %primeCounter ==0){ //If the number divides evenly, it displays prime factors
                System.out.println ("Prime Factors " +primeCounter);
                userNum = userNum / primeCounter; //Sets new value for user number


            }
            else if (userNum % primeCounter != 0){ //If the value does not divide evenly, it is incremented.
                primeCounter ++; //Increment prime counter variable by 1
            }
        }
        userInput.close(); //Close scanner
    }
}
