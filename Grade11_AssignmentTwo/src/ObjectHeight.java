//Original Date: 19/10/2015
//Author: MonocleHat
import java.util.Scanner;
public class ObjectHeight {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Declaring variables
        double Height = 100; //Setting the starting height to 100
        double time; //This variable holds the time given by the user

        //Program start
        Scanner timeInput = new Scanner (System.in); //Setting up the scanner
        System.out.println ("Enter a time less than 4.5 seconds:");
        time = timeInput.nextDouble(); //Using the Scanner, and user input to give the "Time" variable a value
        Height = Height - time * time * 4.9 ; //Calculating the height of the object based on time entered
        System.out.println ("The height of the object is: " +Height );
        timeInput.close(); //Closing the scanner
        //Program end
    }
}
