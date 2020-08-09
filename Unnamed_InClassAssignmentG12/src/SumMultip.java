import java.util.Scanner;
public class SumMultip {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int userNum; //User generated number
        int numberSum = 0; //Sum of numbers
        int multiplySum = 1;
        Scanner userPrompt = new Scanner (System.in); //Scanner for user input
        System.out.println ("Enter a non negative interger");
        userNum = userPrompt.nextInt(); //After prompt, the user enters the number
        while (userNum > 0){ //Loop opens, condition: will run as long as userNum is positive int
            multiplySum = multiplySum * (userNum % 10);

            numberSum = numberSum + userNum % 10; //Divides the number in order to obtain a single digit
            userNum = userNum/10; //Divides the number by 10 to remove one digit


        }
        System.out.println ("The sum of the digits: "+numberSum);
        System.out.println ("The digit product is: " +multiplySum);
        userPrompt.close(); //Closes input stream
    }
}
