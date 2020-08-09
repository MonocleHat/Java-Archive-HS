import java.util.*;
public class countLetters {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int vowelCount = 0; //Sets vowel count to 0
        int consCount = 0;//Sets consonant count to 0
        char [] letterCount; //Creates char array
        Scanner userInput = new Scanner (System.in);
        String userWord = new String();//Stores user word, to be converted to char array

        System.out.println("Enter a word");
        userWord = userInput.nextLine();//get input
        userWord =userWord.toLowerCase();//set word to lower case
        letterCount = userWord.toCharArray(); //Converts the word to individual letters which are stored in the char array

        for (int i=0; i<letterCount.length;i++){//For loop runs, scanning along the length of the word letter by letter until it reaches the end.
            if (letterCount[i]=='a'||letterCount[i]=='e'||letterCount[i]=='o'||letterCount[i]=='u'){//If the letter is a vowel, add 1 to vowel count
                vowelCount++;
            }else{
                consCount++; //Else add one to consonant count
            }
        }
        System.out.println("Vowel Count: " +vowelCount); //Display vowel count
        System.out.println("Consonant Count: " +consCount); //Display consonant count
        userInput.close();//Close user input
    }
}
