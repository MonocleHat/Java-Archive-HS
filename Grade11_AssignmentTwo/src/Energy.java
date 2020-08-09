import java.util.Scanner;
//Original Date: 19/10/2015
//Author: MonocleHat
public class Energy {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        final double SOL = (3.0*10*10*10*10*10*10*10*10); //Final variable that contains the completed equation for calculating speed of light
        double mass; //Holds a value input by the user
        double Joules; //The same value as energy, which will be calculated by multiplying mass by speed of light twice
        double powered; //Lightbulbs powered.
        double energy; //Holds the value determined by the equation Mass* SOL* Mass*SOL

        Scanner massKM = new Scanner (System.in); //Create scanner
        System.out.println("Enter a mass in kilograms");
        mass = massKM.nextDouble(); //User inputs a mass value
        energy = mass * SOL * mass * SOL; //The calculation E = MC squared is performed to find the value of energy
        Joules = energy; //Joules is given a value
        System.out.println ("The energy produced in Joules is = " +Joules);
        powered = Joules / 360000; //When joules is divided by three hundred sixty thousand (360,000) it gives us the lightbulbs powered
        System.out.println ("Light Bulbs Powered (100-watt): " +powered);
        massKM.close();//Close program
    }
}
