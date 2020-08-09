import java.util.Scanner;
public class Encrypt2 {
    public static void main (String[]args){

        //Swap first last character
        //shift letters in between by 3
        //if less than 3 char, no middle words
        //no first and last letters to swap if 2 letters

        Scanner userPrompt = new Scanner(System.in);
        String userWord = userPrompt.nextLine();
        String[] splitArray = userWord.split(" ");
        for (int i=0;i<splitArray.length;i++){
            if (splitArray[i].length() >=2){
                String FW =splitArray[i].substring(splitArray[i].length()-1);
                String LW = splitArray[i].substring(0,1);
                String newM= splitArray[i].substring(1,splitArray[i].length()-1);
                splitArray[i] = FW + newM+LW  ;

            }
            //System.out.print(splitArray[i]);
            //encrypt mid chars if greater than 2
            if (splitArray[i].length() > 2){
                //go through chars in splitArray[i]
                //but not the first and last
                for (int j = 1;j<splitArray[i].length()-1;j++){
                    //takes current char and shifts 2 to the right eg. a-> c
                    char x = (char) (splitArray[i].charAt(j)+2);
                    String temp = splitArray[i];
                    splitArray[i] = temp.substring(0,j) + x + temp.substring(j+1);
                }
                System.out.println(splitArray[i]);
            }

        }


    }
}
