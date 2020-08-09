import java.util.Scanner;
public class RemoveString {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String userSentence = new String (); //String variable holds the user's sentence
        String userInput = new String (); //String variable holds the user's word to remove
        Scanner remove = new Scanner (System.in); //Scanner used for input

        System.out.println ("Enter a sentence");
        userSentence = remove.nextLine(); //Gets user sentence
        userSentence= userSentence.toLowerCase(); //Converts to lowercase
        System.out.println ("Enter a word to remove");
        userInput = remove.nextLine(); //Gets word to remove
        userInput = userInput.toLowerCase(); //converts word to lowercase
        //System.out.println (userInput); used to test response, debug purposes.
        userSentence=userSentence.replaceAll(userInput,""); //Replaces the word with a blank space. Removing it.
        System.out.println (userSentence); //Displays sentence
    }
}
