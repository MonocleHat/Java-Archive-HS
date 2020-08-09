import java.util.Scanner;
public class necklaceProblem {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int firstNum; //Contains the first number
        int secondNum; //Contains the second number
        int firstContain; //Retains a copy of the original first number
        int secondContain; //Retains a copy of the original second number
        int temp; //Temp container variable used when transferring numbers

        Scanner userInput = new Scanner (System.in); //Declaring scanner
        System.out.println("Enter first num");
        firstNum = userInput.nextInt(); //Gets input value of the first number
        firstContain = firstNum; //Holds the first number
        System.out.println("Enter second num");
        secondNum = userInput.nextInt(); //Gets input value of the second number
        secondContain = secondNum; //Holds the second number
        System.out.print(firstNum);
        System.out.print(secondNum);
        do{


            temp = (firstNum + secondNum)%10; //Calculates a temp amount to be transferred over later
            firstNum = secondNum; //Makes the first number equal to the second
            secondNum = temp; //The second number will then equal the value in temp variable
            System.out.print(secondNum); //displays second number
			/*Debugging
			System.out.println("First Number after loop: " +firstNum);

			System.out.println("Second Number after loop: " +secondNum);

			System.out.println("Temp variable: " +temp);
			 */
        }while (!(firstNum == firstContain && secondNum == secondContain)); //Loop runs as long as the first and second numbers arent equal to their original values
        userInput.close(); //Closes scanner
    }
}
