//Original Date: 19/10/2015
//Author: MonocleHat
import java.util.Scanner;
public class PizzaCost {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Variable setting
        final double LABOR = 0.75; //The "Final" variables dont change...
        final int RENT = 1;//...because the costs for them remain the same for every order
        double Materials = 0.05; //Cost of materials becomes value of variable
        double Cost; //Overall cost of order, to be determined at the end
        double Diameter; //To be given by the user, the diameter of the pizza

        //PROGRAM STARTS
        Scanner foodSize = new Scanner (System.in); //Setting scanner up
        System.out.println ("Enter the diameter of the pizza (in inches): ");
        Diameter = foodSize.nextDouble(); //Asking the user to give the variable "Diameter" a value
        Materials = Diameter * Diameter * Materials;
        Cost = Materials + RENT + LABOR; //Final calculations take place
        System.out.println("The cost of making this pizza is: $" +Cost);
        foodSize.close(); //Scanner is closed
        //PROGRAM ENDS
    }
}
