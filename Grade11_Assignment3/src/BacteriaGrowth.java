import java.lang.Math;
import java.util.Scanner;

//Author: MonocleHat
//Original date: 2015-11-11
public class BacteriaGrowth {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double Y;
        final double K;
        double N;
        double T;

        Scanner UserPrompt = new Scanner (System.in);
        System.out.println("Enter Initial bacteria amount: ");
        N = UserPrompt.nextDouble();
        System.out.println("Enter a constant value for K: ");
        K = UserPrompt.nextDouble();
        System.out.println("Enter the growth time period in hours: ");
        T = UserPrompt.nextDouble();
        Y = N *(Math.exp(K*T));
        System.out.println(+Math.round(Y) +" Bacteria will be present after " +T +"hours");
        UserPrompt.close();
    }
}
