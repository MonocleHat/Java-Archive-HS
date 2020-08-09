import java.util.*;
public class Arrays_CountLetters {
    public static void main(String[] args){
        String word;
        Scanner input = new Scanner (System.in);
        final int LOW = 'A';
        char[] wordLetters; //array with letters from input string
        int[] letterCount; //Array with integers
        int offset; //To return to

        //prompt user for a string
        System.out.println("Enter a single word: ");
        word = input.nextLine();

        //convert word to char array
        word = word.toUpperCase();
        wordLetters = word.toCharArray(); //This array has a size = word.length

        //Initialize the size of the int array
        letterCount = new int [26];

        //Count frequency of each letter in char array

        for (int i = 0;  i< wordLetters.length; i++){
            offset = wordLetters[i] - LOW; //Shift the range of values
            letterCount[offset]+=1;
        }
        //display the frequency of each letter
        for (int j =0; j<26; j++){

            System.out.println (letterCount[j]);


        }
        input.close();
    }
}
