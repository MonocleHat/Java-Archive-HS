import java.util.Scanner;
public class NumberSum {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        final int STARTNUM = 1;
        int endNumber;
        int rangeNumbers = 0;
        int sumContainer = 0;

        Scanner userPrompt = new Scanner (System.in);
        System.out.println("Enter a number: ");
        endNumber = userPrompt.nextInt();

        while (rangeNumbers <= endNumber){
            rangeNumbers = STARTNUM + rangeNumbers;
            sumContainer = sumContainer + rangeNumbers;
            System.out.println (rangeNumbers);
            if (rangeNumbers == endNumber){
                System.out.println (sumContainer);
            }
        }
        userPrompt.close();
    }
}
