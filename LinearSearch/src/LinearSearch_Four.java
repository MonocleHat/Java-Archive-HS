
public class LinearSearch_Four {
    public static void main(String[] args) {
        //0  1  2  3  4  5  6  7
        int list[] = {10, 13, 9, 17, 40, 21, 100, 99};
        int target = 21;
        int found = LinearSearch(list, target);
        if (found == -1) {
            System.out.println("The target element is not on the list");
        } else {
            System.out.println("The target element " + target + " is at index " + found);
        }
    }//end main

        public static int LinearSearch(int A[], int target){
            //int index = -1;
            //boolean found = false;
            //there was a && !false after the A.length; thing.
            for (int i = 0;i<A.length; i++){
                if (A[i]==target)
                    return i;
                //found = true;
            }
            return -1;
        }
}
