import java.util.Scanner;
import java.lang.Math;
//Author: MonocleHat
//Original Date: 2015-10-21
public class CircleCircumference {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        final double PI = 3.14;
        double R;
        double Circumference;

        Scanner UserPrompt = new Scanner (System.in);
        System.out.println("Please enter the radius of the circle.");
        R = UserPrompt.nextDouble();
        if (R > 0){
            Circumference = 2 * PI * R;
            Circumference = Math.round ((Circumference * 100.0)) / 100.0;
            System.out.println("The Circumference of the Circle is: " +Circumference);
        }
        else if (R< 0){
            System.out.println("Negative Radii are illegal");

        }

    }
}
