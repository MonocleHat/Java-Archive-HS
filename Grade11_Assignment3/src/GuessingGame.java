import java.util.Scanner;
import java.lang.Math;
//Author: MonocleHat
//Original Date: 2015-11-11
public class GuessingGame {
    public static void main(String[] args) {
        int  Max = 20;
        int Min = 1;
        double PlayerNum;
        int secretNo;
        secretNo= (int) ((Max - Min + 1 ) * Math.random() + Min);

        Scanner UserPrompt = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 20: ");

        PlayerNum = UserPrompt.nextDouble();

        if (PlayerNum != secretNo){
            System.out.println("Incorrect");
            System.out.println ("The number was: " +secretNo);

        }
        else if (PlayerNum == secretNo) {
            System.out.println ("Correct");
        }
        UserPrompt.close();
    }

}
