import java.util.Scanner;
public class UpperCase {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner userPrompt = new Scanner (System.in);
        String userString = new String ();
        char userArray[];
        System.out.println("Enter a word");
        userString = userPrompt.nextLine();
        userArray = userString.toCharArray();

        for (int i = 0;i<userArray.length;i++){
            if (userArray[i] >= 97){
                userArray[i] = (char) (userArray[i]-32);
            }
        }
        for (int i = 0;i<userArray.length;i++){
            System.out.print(userArray[i]);
        }
    }
}
