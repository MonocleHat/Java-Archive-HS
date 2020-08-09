import java.util.Scanner;
public class Quadratics {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double ValA;
        double ValB;
        double ValC;
        double Y;
        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter value A");
        ValA = userInput.nextDouble();
        System.out.println ("Enter Value B");
        ValB = userInput.nextDouble();
        System.out.println ("Enter value C");
        ValC = userInput.nextDouble();

        for (double X = -3;X<=3;X++){
            Y = ValA * X * X + ValB * X + ValC;
            System.out.println(X +" , " +Y);
        }
    }
}
