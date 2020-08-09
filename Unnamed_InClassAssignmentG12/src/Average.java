import java.util.Scanner;
public class Average {
    //2016-02-08
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double numOne;
        double numTwo;
        double numThree;
        double numFour;
        double numFive;
        double numSix;
        double tempContain;
        double numAvg;
        Scanner userInput = new Scanner (System.in);
        System.out.println ("Please enter six positive numbers: ");
        numOne = userInput.nextDouble();
        numTwo = userInput.nextDouble();
        numThree = userInput.nextDouble();
        numFour = userInput.nextDouble();
        numFive = userInput.nextDouble();
        numSix = userInput.nextDouble();
        tempContain = numOne + numTwo + numThree + numFour + numFive + numSix;
        numAvg = tempContain / 6;
        System.out.println ("The average of: " +numOne +"," +numTwo +"," +numThree +"," +numFour +"," +numFive +"," +numSix +"; is: " +numAvg);
    }
}
