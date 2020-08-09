import java.util.Scanner;
public class Arrays_1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner userPrompt = new Scanner (System.in);
        int arraySize;
        System.out.println("Enter an array size");
        arraySize = userPrompt.nextInt(); //get user to enter an array size
        int []userArray = new int[arraySize]; //Initialize array to int size

        for (int i = 0; i < userArray.length; i++){
            userArray[i] = 1; //Fill array with 1's

        }
        System.out.println("Enter " +arraySize +" integers");
        for (int z = 0; z < userArray.length; z++){
            userArray[z] = userPrompt.nextInt(); //get user generated integers

        }
        int arrayMax; //Get max value of array
        int arrayLow; //get first value of array
        arrayLow = userArray[0]; //set low value to number at position zero
        arrayMax = userArray [arraySize - 1]; //set max value to the highest position of the array minus one.
        userArray[0] = arrayMax; //set the first position to the final array value
        userArray[arraySize - 1] = arrayLow; //set the final array value to the first position's value
        for (int X = 0; X < userArray.length; X++){
            userArray[X] = Math.abs(userArray[X]); //To change all values to positive

        }
        //Part F
        int sampleSum = 0;
        for (int H = 0; H< userArray.length; H++){
            sampleSum = sampleSum + userArray[H]; //add all array values into one integer
        }
        //Part G
        for (int G = 0; G < userArray.length;G++){
            if (userArray[G] % 2 == 0){
                System.out.print(userArray[G] +" "); //Print all even numbers
            }
        }
        System.out.println("Sum of all numbers: " +sampleSum); //sum of all numbers displayed
        userPrompt.close();
    }
}
