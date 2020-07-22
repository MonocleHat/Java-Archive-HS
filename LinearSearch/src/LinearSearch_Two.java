
import java.util.Scanner;
public class LinearSearch_Two {
    //Questions
//1. The program would return the first instance of the item in the list
//2. To start from the end of the list, one would need to set i to
//   the size of the array minus 1, then change "i++" to "i--"


    public static void main(String[] args) {
        int uNum = 0;
        //Scanner uPrompt = new Scanner(System.in);
        // System.out.println("Enter a single digit int to search for");
        //uNum = uPrompt.nextInt();
        int[] arr = new int[]{1, 3, 5, 7, 8, 6, 9};
        System.out.print("array: ");
        for (int y = 0; y < arr.length; y++) {
            System.out.print(+arr[y] + " ,");
        }
        System.out.println();
        linearSearch(arr, uNum);
    }

    public static void linearSearch(int[] arr, int num) {
        int before = 0;
        int after = 0;
        //int X = num;
        boolean found = false;
        for (int i = 0; i < arr.length && !found; i++) {
            if (arr[i] == 7) {
                before = arr[i - 1];
                after = arr[i];
                arr[i] = before;
                arr[i - 1] = after;
            }
        }
        for (int y = 0; y < arr.length; y++) {
            System.out.print(arr[y] + " ,");
        }
    }


}