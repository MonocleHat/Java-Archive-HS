import java.util.Scanner;
import java.lang.Math;
public class Investments_2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int finalA; //Final Amount earned monthly
        int earnedA = 0; //Final interest earned monthly
        int finalB; //Final amount earned biweekly
        int earnedB=0;//Final interest earned biweekly
        int finalC;//Final Amount earned Daily
        int earnedC = 0; //Final interest earned daily
        double initialP; //Initial Investment
        double interestR; //interest rate
        double yearsT;//years
        Scanner userPrompt = new Scanner (System.in); //get user input

        System.out.print("Initial Investment: ");
        initialP = userPrompt.nextDouble();
        System.out.println();
        System.out.print("Interest Rate: ");
        interestR = userPrompt.nextDouble();
        System.out.println();
        System.out.print("Years to Invest: ");
        yearsT = userPrompt.nextDouble();
        System.out.println();
        interestR = interestR / 100; //Changes the initial interest number entered into percentage
        //Displays the final values based on the different compound period
        //A Monthly
        finalA = (int) (initialP * Math.pow(1+interestR/12.0, 12*yearsT)); //Calculating using an interest formula.
        System.out.println("Final balance in a monthly compound period: "+finalA);
        earnedA = (int) (finalA - initialP);
        System.out.println ("Total interest earned in monthly compound period: " +earnedA);
        System.out.println();
        //B biweekly
        finalB = (int) (initialP * Math.pow(1+interestR/26, 26*yearsT));
        System.out.println("Final balance in a bi-weekly compound period: " +finalB);
        earnedB = (int) (finalB - initialP);
        System.out.println ("Total interest earned in monthly compound period: " +earnedB);
        System.out.println();
        //C daily
        finalC =(int) (initialP * Math.pow(1+interestR/365, 365*yearsT));
        System.out.println("Final balance in a daily compound period: "+finalC);
        earnedC = (int) (finalC - initialP);
        System.out.println ("Total interest earned in monthly compound period: " +earnedC);
    }
}
