import java.util.Scanner;
import java.lang.Math;
//Author: MonocleHat
//Original Date: 2015-11-11
public class MyPow {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double X;
        double Y;
        double FormulaResult;
        double MethodResult;

        Scanner UserPrompt = new Scanner (System.in);
        System.out.println("Enter value for X: ");
        X = UserPrompt.nextDouble();
        System.out.println ("Enter Value for Y: ");
        Y = UserPrompt.nextDouble();

        FormulaResult = Math.exp (Y* Math.log (X));
        MethodResult = Math.pow(X, Y);
        System.out.println("The result from using the formula is: "+FormulaResult);
        System.out.println ("The result from using the Math pow() method is: "+MethodResult);
        UserPrompt.close();
    }
}
