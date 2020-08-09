import java.util.Scanner;
public class DigitsSum {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int userNum; //User generated number
        int numberSum = 0; //Sum of numbers

        Scanner userPrompt = new Scanner (System.in); //Scanner for user input
        System.out.println ("Enter a non negative interger");
        userNum = userPrompt.nextInt(); //After prompt, the user enters the number
        while (userNum > 0){ //Loop opens, condition: will run as long as userNum is positive int
            numberSum = numberSum + userNum % 10; //Divides the number in order to obtain a single digit

            //System.out.println ("system check1 "+userNum); (Used for debugging purposes)

            userNum = userNum/10; //Divides the number by 10 to remove one digit

            //System.out.println ("system check2 "+userNum); (Used for debugging purposes)
        }
        System.out.println ("The sum of the digits is: "+numberSum);
        userPrompt.close(); //Closes input stream
    }
}
