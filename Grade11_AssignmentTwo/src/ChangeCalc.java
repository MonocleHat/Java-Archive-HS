/*
Part of my second assignment during grade 11 of computer science classes.

This specific file and the others alongside them have odd file dates, indicating that they may have been modified at
some point; though im not sure what the differences are other than just a different formatting system for the older ones
I dont think there was anything wrong with the code, so i've just copied it directly over.

Potential Errata: Oddly enough entering arbitrary numbers leads to some weird activity wherein the program decides all
the change is quarters.
Original Date: 19/10/2015
Author: MonocleHat
 */
import java.util.Scanner;
import java.lang.Math;
public class ChangeCalc {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner myChange = new Scanner (System.in);//Creates new scanner
        double Quarters; //Stores value of quarters, determined by later calculations
        double Dimes; //Stores value of dimes, determined by later calculations
        double Nickels; //Stores value of nickels, determined by later calculations
        double Pennies; //Stores value of pennies, determined by later calculations
        double CRemain1; //Stores remainder of the equation "Cents % 25", remaining value of coins after the quarters equation
        double CRemain2; //Stores remainder of the equation "Cents % 10", remaining value of coins after the dimes equation
        double CRemain3; //Stores remainder of "Cents % 5", and is also the value of the pennies variable
        double Cents; //Change to be divided, to be given by the user
        int QuartersINT; //Stores the value of the Quarters variable as an INT
        int DimesINT; //Stores the value of the dimes variable as an INT
        int NickelsINT; //Stores the value of the Nickels variable as an INt
        int PenniesINT; // Stores the value of the pennies variable as an INT

        System.out.print("Please input the amount of change you have (In cents): ");
        Cents = myChange.nextDouble(); //Start scanner
        Quarters = Cents / 25; //The equations are performed
        CRemain1 = Cents % 25; //Value is given to the variables set as the remainder variables
        Dimes = CRemain1 / 10;
        CRemain2 = Cents %10;
        Nickels = CRemain2 / 5;
        CRemain3 = Cents % 5;
        Pennies = CRemain3;
        // Rounds the values
        Quarters = Math.round((Quarters * 10)) /10;
        Dimes = Math.round((Dimes * 10)) /10;
        Nickels = Math.round((Nickels * 10)) /10;
        Pennies = Math.round((Pennies * 10)) /10;
        //converts the values to INT variables to display single numbers
        QuartersINT = (int)Quarters;
        DimesINT = (int) Dimes;
        NickelsINT = (int) Nickels;
        PenniesINT = (int) Pennies;
        //displays final result
        System.out.println ("Display Quarters: " +QuartersINT);
        System.out.println ("Display Dimes: " +DimesINT);
        System.out.println ("Display Nickels: " +NickelsINT);
        System.out.println ("Display Pennies: " +PenniesINT);

        myChange.close();//close scanner
    }
}
