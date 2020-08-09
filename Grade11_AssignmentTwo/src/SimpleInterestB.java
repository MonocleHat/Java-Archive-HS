//Original Date: 19/10/2015
//Author: MonocleHat
import java.util.Scanner;
public class SimpleInterestB {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Declaring variables
        double principal;
        double interest;
        double years;
        double value;

        Scanner UserPrompt = new Scanner (System.in); //Creating the scanner for user input

        System.out.format ("%10s", "Enter the value: ");
        value = UserPrompt.nextDouble();
        System.out.format ("%10s", "Enter the years: ");
        years = UserPrompt.nextDouble();
        System.out.format ("%10s", "Enter the interest rate: ");
        interest = UserPrompt.nextDouble();
        principal= value / (1+years*interest); //This equation allows us to find the principal
        System.out.println("The principal invested needs to be: " +principal);
        UserPrompt.close(); //closes scanner
    }
}
