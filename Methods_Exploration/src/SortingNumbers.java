import java.util.*;
public class SortingNumbers {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[]someNums;
        int arrayContain;
        someNums = new int[11];
        for (int i=0;i <(someNums.length-1);i++){
            Random randNum = new Random();
            arrayContain = (randNum.nextInt(100)+1);
            someNums[i]=arrayContain;
        }
        bubbleSort(someNums);
    }
    public static void bubbleSort(int[] someNums){
        int temp;
        for (int i = 0; i < (someNums.length - 1); i++){
            for (int j = 0; j < (someNums.length - 1); j++){


                if (someNums[j] >someNums[j+1]){
                    temp = someNums[j];
                    someNums[j] = someNums[j+1];
                    someNums[j+1] = temp;

                }
            }

        }
        for (int x =0; x<someNums.length; x++){
            System.out.println(someNums[x]);
        }
    }
}
