/*
This file dealt with simple usage of division and modulus features in java, like the other files here, it also has
another version featuring commentless code. for the sake of reading im just going ahead and using the
formatted and commented code.

Errata: None

Author: MonocleHat
Original Date: 19/10/2015
 */
import java.util.Scanner;
import java.lang.Math;
public class DivideAndModulus {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner UserInput = new Scanner (System.in); //Creating Scanner
        double NoOne; //This variable holds our first number, which will be later converted to INT
        double NoTwo; //This variable holds our second number which will later be converted to INT
        double Remain; //Holds our remainder
        int RemainIOne; //This variable holds the remainder of the first equation, as an interger variable
        int RemainITwo; //This variable does the same as the one above it, except it holds the remainder of the second equation
        double result1Dec; //Holds the decimal number result of the first equation
        int result1Int; //Holds the single number result of the first equation
        double result2Dec; //Holds the decimal number result of the second equation
        int result2Int; //Holds the single number result of the second equation

        //FIRST EQUATION
        System.out.println("Enter one number");
        NoOne = UserInput.nextDouble(); //User enters the first number
        System.out.println ("Enter another");
        NoTwo = UserInput.nextDouble(); //User enters the second number
        result1Dec = NoOne / NoTwo;
        result1Dec = Math.round(result1Dec); //as the first result is calculated, it is then rounded to the nearest whole number
        result1Int = (int) result1Dec; //It is converted to int to create a single digit number
        System.out.println ("Result of First int divided by the second: " +result1Int);
        Remain = NoOne % NoTwo; //The remainder of the first equation is given
        Remain = Math.round(Remain);
        RemainIOne = (int) Remain; //It is rounded, and then converted to an int variable

        System.out.println("Remainder: " +RemainIOne);

        //SECOND EQUATION
        result2Dec = NoTwo/NoOne; //The second equation begins, and the result is rounded and converted to int
        result2Dec = Math.round(result2Dec);
        result2Int = (int) result2Dec;
        System.out.println("Result of second int divided by the first:" +result2Int);
        Remain = NoTwo%NoOne; //the remainder is calculated
        Remain = Math.round(Remain);
        RemainITwo = (int) Remain; //And then the remainder is converted to int
        System.out.println("Remainder: " +RemainITwo);
        UserInput.close(); //Scanner closes
    }
}
