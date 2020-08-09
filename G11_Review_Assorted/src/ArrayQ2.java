import java.util.Scanner;
public class ArrayQ2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int []arrayOne = new int [14];
        int []arrayTwo = new int [14];
        Scanner userPrompt = new Scanner(System.in);
        for(int i = 0; i<arrayOne.length;i++){
            System.out.println("enter an int");
            arrayOne[i]= userPrompt.nextInt();

        }

        int containerHelper;
        for(int z = arrayOne.length-1; z>=0;z--){
            containerHelper = arrayOne[z];
            arrayTwo[z]=containerHelper;
            System.out.println(arrayTwo[z]);
        }

        System.out.println("Using only one array");
        //int containerTwo;
        int R = arrayOne.length-1;
        for (int X = arrayOne.length-1;X>=0;X--){
            arrayOne[R] = arrayOne[X];
            R--;
            System.out.println(arrayOne[X]);
        }


    }
}
