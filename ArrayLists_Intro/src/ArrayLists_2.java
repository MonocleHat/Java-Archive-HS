import java.util.ArrayList;
/*
Part of a set of arraylist projects that were created in early 2017
I assume that these files were created as part of a lesson on creation of more advanced array types.
Some of these files use now deprecated systems and i've tried to upgrade them as best as i can.


File 2:
 Contents: adds a series of numbers to our array list and prints them out

 Errata: Due to deprecation of Double() assignments, i cannot add a value to the system via this constructor
 in the original code, the values were added to the arraylist via arr.add(<index>,new Double(<value>));

Original Creation Date: 2017-02-22
Date of Modification: 2020-06-26 - By Brandyn "MonocleHat"
*/
public class ArrayLists_2 {

    public static void main(String[]args){
        ArrayList<Double> arr = new ArrayList<Double>();
        arr.add(0,3.2);
        arr.add(0, (double) 5);
        arr.add(1, 4.2);
        Double result = arr.get(0);
        System.out.println(result);
        Double result2 = arr.set(2,7.2);
        System.out.println(result2);
        System.out.println(arr.size());
        arr.add(3, (double) 20);
        double result3 = arr.get(3);
        System.out.println(result3);
    }
}
