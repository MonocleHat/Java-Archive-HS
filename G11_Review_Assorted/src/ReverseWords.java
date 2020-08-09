import java.util.Scanner;
public class ReverseWords {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a line of text: ");
        String userWord = input.nextLine();
        char[]spAr = userWord.toCharArray();
        char containerHelper;
        int a = spAr.length;
        char []arrayTwo = new char[a];
        for(int z = spAr.length-1; z>=0;z--){
            containerHelper = spAr[z];
            arrayTwo[z]=containerHelper;
            if (arrayTwo[z] == 32){
                System.out.println("");

            }
            System.out.print(arrayTwo[z]);

        }
	/*	System.out.println("no reverse");
		for (int i = 0; i < arrayTwo.length;i++){
			if (arrayTwo[i] == 32){
				System.out.println(" ");

			}
			System.out.print(arrayTwo[i]);

		}*/



    }
}
