import java.util.Scanner;

//Author: MonocleHat
//Original Date: 2015-10-21
public class SurfsUp {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int WaveH;

        Scanner UserPrompt = new Scanner (System.in);
        System.out.println("Enter the current height of the waves (In FT): ");
        WaveH = UserPrompt.nextInt();
        if (WaveH == 6) {
            System.out.println("Conditions for surfing are currently great.");
        }
        //Part B Begins
        else if (WaveH < 6){
            System.out.println ("Conditions not ideal for surfing.");
            System.out.println("Go body boating instead.");


        }
    }
}
