//Author: Brandyn "MonocleHat"
//Original Date: 2015-11-25
import java.util.Scanner;
public class Prompter {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int minValue;
        int maxValue;
        int userNumber;

        Scanner userInput = new Scanner (System.in);
        System.out.println("Please enter a minimum number: ");
        minValue = userInput.nextInt();
        System.out.println("Please enter a maximum number: ");
        maxValue = userInput.nextInt();

        do {
            System.out.println("Enter a number between the range of: " +minValue +"and" +maxValue);
            userNumber = userInput.nextInt();
        } while (userNumber < minValue || userNumber > maxValue);


    }
}
