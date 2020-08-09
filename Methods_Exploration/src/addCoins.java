/*
So this set of stuff was from a weird "study" thing on Methods in java. Occasionally our classes would do this thing
where we'd review certain facets of java by focusing on a large set of questions to solve. weirdly enough these all
had various sets of dates ranging at earliest from january 14th 2016 to may 17th 2016.
Original Date: 2016/04/21
Author: MonocleHat
 */
import java.util.Scanner;
public class addCoins {
    public static void getDollarAmount(int quarterCount,int nickelCount, int dimeCount, int pennyCount){
        double addVal = (quarterCount * 0.25)+ (nickelCount * 0.05)+(dimeCount*0.10)+(pennyCount*0.01);
        System.out.printf("Total: $%.2f%n",addVal);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int quarterCount;
        int dimeCount;
        int nickelCount;
        int pennyCount;
        Scanner userInput = new Scanner (System.in);
        System.out.println("Enter coins");
        System.out.print("Quarters: ");
        quarterCount = userInput.nextInt();
        System.out.print("Dimes: ");
        dimeCount = userInput.nextInt();
        System.out.print("Nickels: ");
        nickelCount = userInput.nextInt();
        System.out.print("Pennies: ");
        pennyCount = userInput.nextInt();
        getDollarAmount(quarterCount,dimeCount,nickelCount,pennyCount);

    }
}
