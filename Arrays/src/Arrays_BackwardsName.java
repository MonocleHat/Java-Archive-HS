import java.util.*;
public class Arrays_BackwardsName {
    public static void main(String[] args) {
        String name = new String();
        char [] reverse;
        Scanner userPrompt = new Scanner (System.in);

        System.out.println ("Enter a name");
        name = userPrompt.nextLine();
        //int x = name.length();
        reverse = name.toCharArray();
        for (int i = (name.length()-1); i >= 0; i--) {
            //reverse[i] = (char) i;
            //x--;
            System.out.print(reverse[i]);
        }
        userPrompt.close();
    }
}
