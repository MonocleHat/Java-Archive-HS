import java.util.Scanner;
//2015-11-25
public class Factorial {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //if number is 5 for example, it multiplies from 1 - 5 (1x2x3x4x5)
        int endNum; //user generated number;
        int factor = 1; //would display factorial of number

        Scanner userPrompt = new Scanner (System.in);
        System.out.println("Enter number ");
        endNum = userPrompt.nextInt();

        for (int startNum = 1; startNum <= endNum; startNum++){
            //System.out.println("Before: " +startNum); checking before equations
            factor = factor * startNum;
            //System.out.println("After: "+startNum); checking after equations
        }

        System.out.println (factor);
    }
}
