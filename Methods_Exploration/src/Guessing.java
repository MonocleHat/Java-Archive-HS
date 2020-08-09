import java.util.Scanner;
public class Guessing {
    public static void giveHint(boolean hintFlag){
        if (hintFlag == true){
            System.out.println("Hint: Try a lower number");
        }else if (hintFlag == false){
            System.out.println("Hint: Try a higher number");
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int  Max = 20;
        int Min = 1;
        double PlayerNum;
        int secretNo;
        boolean hintFlag;//If false, too low. if true, too high
        secretNo= (int) ((Max - Min + 1 ) * Math.random() + Min);

        Scanner UserPrompt = new Scanner(System.in);

        do{
            System.out.print("Enter a number between 1 and 20: ");
            PlayerNum = UserPrompt.nextDouble();

            if (PlayerNum > secretNo){
                hintFlag =true;
                System.out.println("Incorrect");
                giveHint(hintFlag);
            }
            else if (PlayerNum < secretNo) {
                hintFlag = false;
                giveHint(hintFlag);
            }else if (PlayerNum == secretNo){
                System.out.println("Correct Number");
                break;
            }
        }while(PlayerNum != secretNo);
        UserPrompt.close();
    }
}
