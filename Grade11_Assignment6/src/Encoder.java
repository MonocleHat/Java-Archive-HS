import java.util.Scanner;
public class Encoder {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner userPrompt = new Scanner (System.in);
        String userWord = new String ();
        char [] encodedArray;//Set new array

        System.out.println("Enter a string: ");
        userWord = userPrompt.nextLine();        //Get user input
        userWord= userWord.toLowerCase();		//Convert letters to lower case
        encodedArray= userWord.toCharArray();//Convert user string to char array, sets array content to the letters of the user's word

        for (int i=0;i< encodedArray.length; i++){ //Set for loop to go letter by letter and read each character in array
            if (encodedArray[i] == 'z'){//if letter at i position is equal to Z replace with B
                encodedArray[i]='b';
            }
            else if (encodedArray[i]=='y'){ //if letter at i position is equal to z replace with B
                encodedArray[i]='a';
            }
            else if (encodedArray[i]==32){ //If letter at i position with unicode value 32, replace with blank
                encodedArray[i]=' ';
            }else{
                encodedArray[i]+=2; //for every other letter, shift unicode value by 2.
            }



        }
        System.out.print("Encoded message: ");
        for (int j=0; j<encodedArray.length; j++){ //Display message encoded

            System.out.print (encodedArray[j]);

        }
        System.out.println();
        System.out.print("Decoded: " +userWord);
        userPrompt.close();//Close input stream.
    }
}
