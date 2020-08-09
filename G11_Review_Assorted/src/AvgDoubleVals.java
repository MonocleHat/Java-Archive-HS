import java.util.Scanner;
public class AvgDoubleVals {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner userPrompt = new Scanner (System.in);
        double numOne;
        double numTwo;
        double numThree;
        double averageNum;

        System.out.println("Enter the first number");
        numOne = userPrompt.nextDouble();
        System.out.println("Enter the second number");
        numTwo = userPrompt.nextDouble();
        System.out.println("Enter the third number");
        numThree = userPrompt.nextDouble();
        averageNum = numOne + numTwo + numThree;
        averageNum = averageNum / 3;

        System.out.println("Average Number: " +averageNum);

        userPrompt.close();
    }
}
