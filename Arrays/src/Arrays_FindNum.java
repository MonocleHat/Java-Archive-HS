import java.util.Scanner;
import java.util.Random;
public class Arrays_FindNum {
    public static class Search {

        /**
         * Returns the index of the element numToFind.
         * -1 returned if element not found.
         * pre: none
         * post: index of numToFind has been returned. -1 has been
         * returned if element not found.
         */
        public static int linear(int[] array, int numToFind) {
            int index = 0;
            while ((array[index] != numToFind) &&
                    (index < array.length - 1)) {
                index += 1;
            }
            if (array[index] == numToFind) {
                return(index);
            } else {
                return(-1);
            }
        }
    }
    public static void main(String[] args) {

        final int MAX = 20;
        int[] numArray = new int[MAX];
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int num, location;
        /* fill array with random numbers */
        for (int i = 0; i < numArray.length;i ++) {
            numArray[i] = rand.nextInt(MAX);
        }
        /* prompt user for a number to search for */
        System.out.print("Enter a number between 0 and " + MAX + ": ");
        num = input.nextInt();
        /* Search for number and notify user of num location */
        location = Search.linear(numArray, num);
        if (location == -1) {
            System.out.println("Sorry, number not found in array.");
        } else {
            System.out.println("First occurrence is at index " +(location+1));
            System.out.println ("See below array");
            for (int i = 0; i < numArray.length;i ++) {
                System.out.print(numArray[i] + " ");
            }
        }
        input.close();
    }
    /**
     * Returns the index of the element numToFind.
     * -1 returned if element not found.
     * pre: none
     * post: index of numToFind has been returned. -1 has been
     * returned if element not found.
     */
    public static int linear(int[] array, int numToFind) {
        int index = 0;
        while ((array[index] != numToFind) &&
                (index < array.length - 1)) {
            index += 1;
        }
        if (array[index] == numToFind) {
            return(index);
        } else {
            return(-1);
        }

    }
}
