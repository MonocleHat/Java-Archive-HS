//Original Date: 19/10/2015
//Author: MonocleHat
import java.util.Scanner;
import java.lang.Math;

public class FastFood {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Declaring variables
        final double BURGERS = 1.69;
        final double FRIES = 1.09;
        final double SODA = 0.99;
        int BurgerOrder;
        int FriesOrder;
        int SodaOrder;
        double CostBurg;
        double CostFry;
        double CostSoda;
        double Total;
        double TaxDisplay;
        double FinalCost;
        final double TAX = 13;
        double Paid;
        double Change;


        Scanner GetOrder = new Scanner (System.in);//Scanner starts


        //The user inputs values and the calculations are performed
        System.out.format ("%10s", "Enter Number of Burgers: ");
        BurgerOrder = GetOrder.nextInt();//Gets user input
        System.out.format ("%10s", "Enter Number of Fries: ");
        FriesOrder = GetOrder.nextInt();//Gets user input
        System.out.format ("%10s", "Enter number of Soda: ");
        SodaOrder = GetOrder.nextInt();//Gets user input
        CostBurg = BURGERS * BurgerOrder;
        CostFry = FRIES * FriesOrder;
        CostSoda = SODA * SodaOrder;
        Total = CostSoda + CostFry + CostBurg;
        Total = Math.round((Total * 100.0)) /100.0;
        System.out.format ("%10s%n", "Total before Tax: " +Total);
        TaxDisplay = Total / 100;
        TaxDisplay = TaxDisplay * TAX;
        TaxDisplay = Math.round((TaxDisplay * 100.0)) /100.0;
        System.out.println("Tax:" +TaxDisplay);
        FinalCost = Total +TaxDisplay;
        FinalCost= Math.round((FinalCost * 100.0) ) /100.0;
        System.out.println ("Final Total: " +FinalCost);
        System.out.format ("%10s","Enter amount tendered: ");
        Paid = GetOrder.nextDouble();
        Change = Paid % FinalCost;
        System.out.println("Change" +Change);
        GetOrder.close(); //Scanner closes

    }
}
