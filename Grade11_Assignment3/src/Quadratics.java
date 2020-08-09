import java.util.Scanner;
import java.lang.Math;
//Author: MonocleHat
//Original Date: 2015/11/11
public class Quadratics {
    public static void main(String[]args){
        double VarA;
        double VarB;
        double VarC;
        double A;
        double B;
        double C;
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Please enter the value for A: ");
        VarA = UserInput.nextDouble();
        System.out.println("Please enter the value for B: ");
        VarB = UserInput.nextDouble();
        System.out.println("Please enter the value for C: ");
        VarC = UserInput.nextDouble();
        C = Math.sqrt(VarB*VarB - (4 *VarA * VarC));
//A = (-VarB + Math.sqrt(VarB*VarB - 4 *VarA * VarC))/2*VarA;
//B = (-VarB - Math.sqrt(VarB * VarB - 4 *VarA * VarC))/2*VarA;
        A = (-VarB + C) / (2*VarA);
        B = (-VarB - C)/ (2 * VarA);
        System.out.println("The roots are " +A +" and "+B);
        UserInput.close();
    }
}
