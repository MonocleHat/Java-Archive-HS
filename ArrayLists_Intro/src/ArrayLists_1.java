/*
Part of a set of arraylist projects that were created in early 2017
I assume that these files were created as part of a lesson on creation of more advanced array types.
Some of these files use now deprecated systems and i've tried to upgrade them as best as i can.


File 1:
    Contents: a simple array list example that takes input on the number of elements.
              it calls a function that generates random numbers and adds each number to the list
              then returns the list.

    Missing: The file is missing a proper handler to call the function and return the actual arraylist.

    Errata:  The program erroneously prints the same number to the entire array instead of different numbers. This
             is easily fixed by adding the randomizer in the for-loop itself instead of before the loop.

Original Creation Date: 2017-02-13
Date of Modification: 2020-06-26 - By Brandyn "MonocleHat"
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
public class ArrayLists_1 {
    public static void main (String[]args){
        int size;
        Scanner uInp = new Scanner (System.in);
        System.out.println("Enter number of elements: ");
        size = uInp.nextInt();
        System.out.println(fillList(size));
    }
    public static ArrayList<Integer> fillList(int x){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i<x; i++){
            int random = (int)(Math.random()*100+1);
            temp.add(random);

        }
        return temp;
    }
}
