/*
Part of a set of arraylist projects that were created in early 2017
I assume that these files were created as part of a lesson on creation of more advanced array types.
Some of these files use now deprecated systems and i've tried to upgrade them as best as i can.


File 3: Combination of ArrayLists used with scanners, methods, and other various features to calculate the averages of
a list of integers. a simple example really

Original Creation Date: 2017-02-22
Date of Modification: 2020-06-26 - By Brandyn "MonocleHat"
*/
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList_3 {
public static void main(String[] args){
    int userNum;
    int Max = 100;
    int Min = 1;
    int x;
    Scanner userPrompt = new Scanner(System.in);
    System.out.println("Enter an int");
    userNum = userPrompt.nextInt();
    ArrayList<Integer> aryLst = new ArrayList<Integer>();
    System.out.println(fillAL(userNum, Max, Min, aryLst));
    System.out.println("Average: " + calcAvg(aryLst));
    System.out.println("Max:" + findMax(aryLst));
    System.out.println("Min: " + findMin(aryLst));
}

    public static ArrayList<Integer> fillAL(int userNum, int Max, int Min, ArrayList aryLst) {
        int x;
        for (int i = 0; i <= userNum; i++) {
            x = (int) ((Max - Min + 1) * Math.random() + Min);
            aryLst.add(x);
        }
        //for(int i = 0; i<=userNum;i++){
        //System.out.println(aryLst.get(i));
        // }
        return aryLst;

    }

    public static int calcAvg(ArrayList<Integer> aryLst) {
        int length = 0;
        int numCont = 0;
        int avgCont = 0;

        for (int i = 0; i < aryLst.size(); i++) {
            length++;
        }
        for (int i = 0; i < aryLst.size(); i++) {
            numCont = numCont + aryLst.get(i);
        }
        avgCont = numCont / length;
        return avgCont;
    }

    public static int findMin(ArrayList<Integer> aryLst) {
        int min;
        min = aryLst.get(0);
        for (int i = 0; i < aryLst.size(); i++) {
            if (min > aryLst.get(i)) {
                min = aryLst.get(i);
            }
        }
        return min;
    }

    public static int findMax(ArrayList<Integer> aryLst) {
        int max;
        max = aryLst.get(0);
        for (int i = 0; i < aryLst.size(); i++) {
            if (max < aryLst.get(i)) {
                max = aryLst.get(i);
            }
        }
        return max;
    }
}
