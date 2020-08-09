import java.util.Scanner;
public class sortLetters {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner userPrompt = new Scanner (System.in);
        System.out.println("Please enter a single lowercase character");
        char letter1 = userPrompt.next(".").charAt(0);
        System.out.println(letter1);
        System.out.println("Please enter a single lowercase character");
        char letter2 = userPrompt.next(".").charAt(0);
        System.out.println(letter2);
        System.out.println("Please enter a single lowercase character");
        char letter3 = userPrompt.next(".").charAt(0);
        System.out.println(letter3);
        if (letter1 > letter2 && letter1 > letter3){
            if (letter2> letter3){
                System.out.println(letter3 +", "+letter2 +", "+letter1);

            }
            else if(letter3 > letter2){
                System.out.println(letter2 +", "+letter3 +"," +letter1);
            }
        }
        if (letter2 > letter1 && letter2 > letter3){
            if (letter1> letter3){
                System.out.println(letter3  +", "+letter1  +", "+letter2);
            }
            else if(letter3 > letter1){
                System.out.println(letter3  +", "+letter1  +", "+letter2);
            }
        }
        if (letter3 > letter1 && letter3 > letter2){
            if (letter1> letter2){
                System.out.println(letter2  +", "+letter1 +", " +letter3);
            }
            else if(letter2 > letter1){
                System.out.println(letter1  +", "+letter2 +", " +letter3);
            }
        }

        userPrompt.close();
    }
}
