import java.util.Scanner;
public class Arrays_2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int []arrayOne = new int [14]; //First array
        int []arrayTwo = new int [14]; //second array
        Scanner userPrompt = new Scanner(System.in);
        for(int i = 0; i<arrayOne.length;i++){
            System.out.println("enter an int");
            arrayOne[i]= userPrompt.nextInt();//enter the integer

        }

        int containerHelper; //transfers values from first array to second array in reverse order
        for(int z = arrayOne.length-1; z>=0;z--){
            containerHelper = arrayOne[z];
            arrayTwo[z]=containerHelper;
            System.out.println(arrayTwo[z]); //print out array one in reverse
        }

        System.out.println("Using only one array");
        int R = arrayOne.length-1; //Contains the value of array one minus one position
        for (int X = arrayOne.length-1;X>=0;X--){
            arrayOne[R] = arrayOne[X]; //reverses array
            R--;
            System.out.println(arrayOne[X]); //display array
        }

        userPrompt.close(); //closes input stream
    }
}
