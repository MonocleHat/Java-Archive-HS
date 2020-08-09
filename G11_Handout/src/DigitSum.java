import java.util.*;
//Author: MonocleHat
//Original Date: 2016-07-27
public class DigitSum {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int userNum;
        int numberSum = 0;

        Scanner userPrompt = new Scanner (System.in);
        System.out.println ("Enter a non negative interger");
        userNum = userPrompt.nextInt();
        while (userNum > 0){
            numberSum = numberSum + userNum % 10;
            System.out.println ("system check1 "+userNum);
            userNum = userNum/10;
            System.out.println ("system check2 "+userNum);
        }
        System.out.println (numberSum);
    }
}
