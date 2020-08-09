import java.util.*;
/*
following the abrubt leave of our computer science prof we were introduced to a rather not all too serious professor
who didnt really "fit the bill" so to speak. We basically ended up looping back and covering all our previous content
during that year and didnt really advance much. as such our summative was...lackluster.
Heres the code from those programs
original date: 05-30-16
Author: MonocleHat
 */
public class ApproxPi_One {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double xValue; //Stores the X value of a coordinate
        double yValue; //Stores the Y value of a coordinate
        double distanceVal = 0; //Is the value of X^2 + Y^2 squared, if over one, its outside unit circle
        double loopCount = 0 ; //Counts total points created
        double insideCircle = 0; //Counts amount of points in circle
        double iterationLoop = 0;
        Random rand = new Random(); //Initializes random variable
        Scanner userIteration = new Scanner(System.in);
        System.out.println("How many iterations would you like to run? ");
        iterationLoop = userIteration.nextDouble();
        do{
            xValue = rand.nextDouble(); //Randomizes a real number (between 0.0-1.0)
            yValue = rand.nextDouble();
            distanceVal = Math.sqrt((xValue*xValue) + (yValue*yValue)); //Calculates distance from point to origin
            if(distanceVal >1){ //If over 1, outside of circle
                loopCount++;
            }else if (distanceVal <=1){ //In circle
                loopCount ++;
                insideCircle++;
            }
        }while(loopCount!=iterationLoop); //Closes after x iterations (X determined by user)

        double PI = 4 * insideCircle/loopCount; //Calculates PI using the equation 4 * number of points inside/total points
        System.out.println("A total of: " +PI +" " +"Points lie inside the quarter circle (out of "+iterationLoop +" tries)");
        /*The resulting number of points may be displayed as 3.12. In this case, it has 2 digits of accuracy
         * since it is one digit away from 3.14.
         */
    }
}
