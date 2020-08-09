import java.util.Scanner;
import java.lang.Math;
//Author: MonocleHat
//Original Date: 2015-11-11
public class Volumes {
    public static void main(String[]args){
        double lengthRec;
        double widthRec;
        double heightRec;
        double volRec;
        double radiusSphere;
        final double PI = 3.14159265359;
        double volSphere;
        double cubeSideLength;
        double volCube;

        Scanner userPrompt = new Scanner (System.in);
        System.out.println("Enter the length: ");
        lengthRec = userPrompt.nextDouble();
        System.out.println("Enter the width: ");
        widthRec = userPrompt.nextDouble();
        System.out.println("Enter the height: ");
        heightRec = userPrompt.nextDouble();

        volRec = lengthRec * widthRec * heightRec;
        System.out.println ("The volume is: " +volRec);

        System.out.println("Sphere");
        System.out.println("Enter the radius: ");
        radiusSphere = userPrompt.nextDouble();

        volSphere = 4 * PI * (Math.pow(radiusSphere, 3)) / 3;
        System.out.println("The volume is: " +volSphere);

        System.out.println("Cube");
        System.out.println ("Enter the length of each side: ");
        cubeSideLength = userPrompt.nextDouble();
        volCube = Math.pow(cubeSideLength, 3);
        System.out.println ("The volume is: " +volCube);

        userPrompt.close();
    }
}
