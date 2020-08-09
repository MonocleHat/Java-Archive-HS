import java.util.Scanner;
public class Quadratics_2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double ValA; //Stores Value A
        double ValB; //Sores Value B
        double ValC; //Stores Value C, determinant
        double Y; //output of coordinates
        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter value A");
        ValA = userInput.nextDouble(); //Get input of value a
        System.out.println ("Enter Value B");
        ValB = userInput.nextDouble(); //Get input of value b
        System.out.println ("Enter value C");
        ValC = userInput.nextDouble(); //Get determinant value c
//Below loop calculates coordinates.
        for (double X = -3;X<=3;X++){
            Y = ValA * X * X + ValB * X + ValC;
            System.out.println(X +" , " +Y);
        }
    }
}
