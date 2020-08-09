import java.util.Scanner;
import java.lang.Math;
//Author: MonocleHat
//Original Date: 2015-11-11
public class Printing {
    public static void main(String[]args){
        //variables
        double Copies;
        double TotalCost;
        double CopyPrice;

        Scanner EnterCopy = new Scanner (System.in);
        System.out.println("Please enter the number of copies to be printed: ");
        Copies  = EnterCopy.nextDouble();

        if (Copies > 0  && Copies < 99 || Copies == 99) {
            CopyPrice = 0.30;
            System.out.println("Price Per Copy is: " +CopyPrice);
            TotalCost = CopyPrice * Copies;
            TotalCost = Math.round((TotalCost * 100.0)) /100.0;
            System.out.println ("Total Cost is: " +TotalCost);

        }
        else if (Copies > 100 && Copies < 499 ||Copies == 100 || Copies == 499 ){
            CopyPrice = 0.28;
            System.out.println("Price Per Copy is: " +CopyPrice);
            TotalCost = CopyPrice * Copies;
            TotalCost = Math.round((TotalCost * 100.0)) /100.0;
            System.out.println ("Total Cost is: " +TotalCost);

        }
        else if (Copies > 500 && Copies < 749 || Copies == 500 || Copies == 749){
            CopyPrice = 0.27;
            System.out.println("Price Per Copy is: " +CopyPrice);
            TotalCost = CopyPrice * Copies;
            TotalCost = Math.round((TotalCost * 100.0)) /100.0;
            System.out.println ("Total Cost is: " +TotalCost);

        }
        else if (Copies > 750  && Copies < 1000 || Copies == 750 || Copies == 1000){
            CopyPrice = 0.26;
            System.out.println("Price Per Copy is: " +CopyPrice);
            TotalCost = CopyPrice * Copies;
            TotalCost = Math.round((TotalCost * 100.0)) /100.0;
            System.out.println ("Total Cost is: " +TotalCost);
        }
        else if (Copies > 1000){
            CopyPrice = 0.25;
            System.out.println("Price Per Copy is: " +CopyPrice);
            TotalCost = CopyPrice * Copies;
            TotalCost = Math.round((TotalCost * 100.0)) /100.0;
            System.out.println ("Total Cost is: " +TotalCost);

        }
        EnterCopy.close();
    }
}
