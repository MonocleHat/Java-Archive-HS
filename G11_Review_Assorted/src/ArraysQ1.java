import java.util.Scanner;
public class ArraysQ1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner userPrompt = new Scanner (System.in);
        int arraySize;
        System.out.println("Enter an array size");
        arraySize = userPrompt.nextInt();
        int []userArray = new int[arraySize];

        for (int i = 0; i < userArray.length; i++){
            userArray[i] = 1;

        }
        System.out.println("Enter " +arraySize +" intergers");
        for (int z = 0; z < userArray.length; z++){
            userArray[z] = userPrompt.nextInt();

        }
        int arrayMax;
        int arrayLow;
        arrayLow = userArray[0];
        arrayMax = userArray [arraySize - 1];
        userArray[0] = arrayMax;
        userArray[arraySize - 1] = arrayLow;
        for (int X = 0; X < userArray.length; X++){
            userArray[X] = Math.abs(userArray[X]);

        }
        //Part F
        int sampleSum = 0;
        for (int H = 0; H< userArray.length; H++){
            sampleSum = sampleSum + userArray[H];
        }
        //Part G
        for (int G = 0; G < userArray.length;G++){
            if (userArray[G] % 2 == 0){
                System.out.print(userArray[G] +" ");
            }
        }
        System.out.println("Sum of all numbers: " +sampleSum);
    }
}
