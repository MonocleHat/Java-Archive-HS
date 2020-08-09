import java.util.*;
public class Fibbonaci {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int fibbSeq[]; //sets our fibbonacci sequence array
        Scanner userInput = new Scanner (System.in);
        int userNum; //Stores a user generated number; The range of the array
        int fibOne = 1; //Sets the first number to 1 (workaround to display "1,1" at start of output
        int fibTwo = 1; //Sets the second number to 1 for the same reason as above.
        int nextNum; //Gets the next number to display

        System.out.println("Please enter a number");
        userNum = userInput.nextInt(); //Get user input
        fibbSeq= new int [userNum]; //Set range
        System.out.println("1");
        System.out.println("1");
        for (int i=0; i < (userNum-2); i++){//For loop adds the first two int into a third variable, depending on the array range
            nextNum = fibOne + fibTwo;
            fibbSeq[i]=nextNum; //the new number is placed at position i in the array
            fibOne = fibTwo;//Sets fibOne as previous number
            fibTwo = nextNum; //Sets fibTwo as next number value
            System.out.println(fibbSeq[i]);//Output
        }
        userInput.close();//close input stream
    }
}
