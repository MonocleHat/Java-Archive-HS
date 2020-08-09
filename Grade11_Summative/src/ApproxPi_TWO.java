import java.util.*;
public class ApproxPi_TWO {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double xValue; //Stores the X value of a coordinate
        double yValue; //Stores the Y value of a coordinate
        double distanceVal = 0; //Is the value of X^2 + Y^2 squared, if over one, its outside unit circle
        double loopCount = 0 ; //Counts total points created
        double insideCircle = 0; //Counts amount of points in circle
        Random rand = new Random(); //Initializes random variable
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
        }while(loopCount!=1000); //Closes after 1000 iterations

        double PI = 4 * insideCircle/loopCount; //Calculates PI using the equation 4 * number of points inside/total points
        System.out.println("A total of: " +PI +" " +"Points lie inside the quarter circle (out of 1000 tries)");
        /*The resulting number of points may be displayed as 3.12. In this case, it has 2 digits of accuracy
         * since it is one digit away from 3.14.
         */
    }
}
