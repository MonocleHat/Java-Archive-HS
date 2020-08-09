import java.util.Scanner;
import java.lang.Math;
//Author: MonocleHat
//Original Date: 2015-11-11
public class TrigFunctions {
    public static void main(String[]args){
        double Angle;
        double Sine;
        double Cosine;
        double Tangent;

        Scanner UserPrompt = new Scanner (System.in);
        System.out.println ("Enter the degree of an angle: ");
        Angle = UserPrompt.nextDouble();
        Angle = Math.toRadians (Angle);
        Sine = Math.sin(Angle);
        Cosine = Math.cos(Angle);
        Tangent = Math.tan(Angle);

        System.out.println("Sine: " +Sine);
        System.out.println("Cosine: " +Cosine);
        System.out.println("Tangent: " +Tangent);
        UserPrompt.close();
    }
}
