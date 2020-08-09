//Original Date: 19/10/2015
//Author: MonocleHat
import java.util.Scanner;

public class GallonConverter {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Declaring Variables
        double Gallons; //Variable holds the gallons given by user
        double Quarts; //Gallons converted to quarts are held in the variable
        double Pints; //Quarts are converted to pints, and held in this variable
        double Cups; //Pints are converted to cups and held in this variable
        double Tablespoons; //Cups are converted to tablespoons and held in this variable

        Scanner GetGallon = new Scanner (System.in); //Scanner created
        System.out.format ("%10s", "Enter the number of gallons: ");
        Gallons = GetGallon.nextDouble(); //asks user to input the amount of gallons

        Quarts = Gallons * 4; //the following calculations are performed...
        Pints = Quarts *2; //...to calculate the values of each variable.
        Cups = Pints * 2;
        Tablespoons = Cups * 16;

        //The results of said calculations are displayed using the code below
        System.out.println ("In " +Gallons +" Gallons there are:");
        System.out.println(+Quarts +" Quarts");
        System.out.println(+Pints +" Pints");
        System.out.println(+Cups +" Cups");
        System.out.println(+Tablespoons +" Tablespoons");
        GetGallon.close(); //closes scanner
    }
}
