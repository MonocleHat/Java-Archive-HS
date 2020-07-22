//Author: MonocleHat
//Original Creation Date: 2017-04-25

/*starting with the middle value, the program sees that the item
requested is higher than the middle value. the program adds one to
the index, and compares the value of the next higher value to that of
the object being searched for, stopping once the target is found.
if the item is higher than the middle value, the index changes to
index - 1, and index + 1 if the value is  lower than the middle value.
*/

//This code only works with a sorted list of values, as an example, 1-11.

public class binSearch {
    public static void main(String[] args) {
        int[] values;
        values = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(binarySearch(values, 6));
    }

    public static int binarySearch(int list[], int item) {
        int index = 0;
        int bottom = 0;
        int top = list.length - 1;
        boolean found = false;
        int middle = 0;

        while (bottom <= top && !found) {
            middle = bottom + (top - bottom) / 2;
            if (list[middle] == item) {
                index = middle;
                found = true;
            } else if (list[middle] < item) {
                bottom = middle + 1;
            } else {
                top = middle - 1;
            }
        }
        return index;
    }
}
