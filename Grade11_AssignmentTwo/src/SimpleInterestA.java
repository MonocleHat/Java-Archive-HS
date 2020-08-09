//Original Date: 19/10/2015
//Author: MonocleHat
import java.util.Scanner;

public class SimpleInterestA {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Declaring variables
        double principal;
        double interest;
        double years;
        double value;

        Scanner UserPrompt = new Scanner (System.in); //Creating scanner
        System.out.format ("%10s", "Enter the principal: ");
        principal = UserPrompt.nextDouble();
        System.out.format ("%10s", "Enter the years: ");
        years = UserPrompt.nextDouble();
        System.out.format ("%10s", "Enter the interest rate: ");
        interest = UserPrompt.nextDouble();
        value = principal * (1+years*interest); //This equation will allow us to calculate the value after the term
        System.out.println("The value after the term is: " +value);
        UserPrompt.close(); //Close scanner
    }
}
