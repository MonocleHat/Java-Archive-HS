import java.util.*;
public class HailstoneSequence {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int N = 0; // User generated number
        int loopCount = 1; //Set loop count to 1 to account for user entered number. Counts iterations of the sequence to total the occuring terms
        Scanner userNum = new Scanner(System.in); //Get user input

        System.out.print("Enter a positive number: ");
        N = userNum.nextInt();//Get positive number from user
        System.out.println(N); //Display user number before rest of hailstone
        while(N != 1){ //While the value of N is not 1, run loop.


            if (N%2==0 ){ //If N is even, divide by two, add one to loopCount
                N = N/2;
                loopCount++;
            }else{ //If N is Odd, multiply by three and add one.  Add one to loopCount
                N = N * 3 + 1;
                loopCount++;
            }
            System.out.println(N); //Display N
        }
        System.out.println("The number of terms in the sequence is: " +loopCount); //Display iterations of hailstone sequence.

        userNum.close();
    }
}
