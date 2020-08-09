import java.util.*;
//Author: Brandyn "MonocleHat"
//Original Date: 2016/02/29
public class OutputExclamation {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int j = 1; j<=5; j++){
            for (int i = 1; i<=12; i++){

                System.out.print("!");

            }
            System.out.print("\n");
        }
        char letter;
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a character: ");
        letter = input.next().charAt(0);
        for (int j = 1; j<=5; j++){
            for (int i = 1; i<=12; i++){

                System.out.print(letter);

            }
            System.out.print("\n");
        }

    }
}
