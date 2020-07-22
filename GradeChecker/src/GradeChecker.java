//Author: MonocleHat
//Original Date: 2017-02-18

/*
The lack of comments in this one tells me little about what its original purpose was or how it worked
from a basic analysis, and knowledge of object oriented programming, This file runs using two classes.


This class is used to perform tasks on a "Grade object", it calls the arraylist and math java modules
The program itself was seemingly incomplete, and its hard to tell what its original function WAS. In an effort to make
some semblance of sense with it, i've attempted to complete it in the way i believe it was meant to be finished

The program runs and calculates a random value for a grade each time, adding the values into the list of array objects
once in this list, a value of a string is initialized
then the program iterates through this list and spits out the values of each grade a student recieved

This assignment may have been for teaching how array lists worked in java, but as the actual code is devoid of comments,
and the original assignment is lost, its hard to be sure.

While the program works, there are still small bugs such as grades not appearing, but its finished finally.
 */

import java.util.ArrayList;
import java.lang.Math;
public class GradeChecker {

    public static void main(String[]args){
        int maxVal = 100;
        int minVal = 0;
        double gradeVal = 0;

        ArrayList<Grade> myList = new ArrayList<Grade>();
        for (int i = 0; i<= 7; i++){
            gradeVal = ((maxVal - minVal + 1) * Math.random() + minVal);
            gradeVal = Math.round((gradeVal * 100.0) ) /100.0;

            Grade g = new Grade(gradeVal);
            myList.add(g);
        }
        String letterValue = " ";
        for (int i=0; i<=7; i++){
            letterValue = myList.get(i).getLetter();
            System.out.println("Student " + (i+1) + " received grade: " + letterValue);
        }
    }
}
