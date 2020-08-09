import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num1; //First number given by the user
        int num2; //Second number given by the user
        int temp = 0; //temp variable to contain the result of calculating the remainder of two numbers
        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter a number");
        num1 = userInput.nextInt(); //Get input
        System.out.println ("Enter a second number");
        num2 = userInput.nextInt(); //Get input

        while (num2>0){ //Loop opens, will run as long as the second number is positive
            temp = num1 % num2; //Temp is assigned remainder
            num1 = num2; //Number one is assigned value of 2
            num2 = temp; //Two is given the remainder value

        }
        System.out.println("The GCD is: " +num1); //Displays greatest common divisor
        userInput.close();//closes stream
    }
}
