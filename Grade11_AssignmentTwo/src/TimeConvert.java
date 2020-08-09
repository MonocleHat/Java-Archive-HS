//Original Date: 19/10/2015
//Author: MonocleHat
import java.util.Scanner;
import java.lang.Math;
public class TimeConvert {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Variables
        double hourD; //This number displays a decimal
        double minD; //This number will display decimals
        double remain; //This number will hold our remainder
        double Input; //This number will contain user input
        int hourI; //Variables marked with "I" will be used to convert the decimal number into an int via type casting
        int minI;

        //Program Start
        Scanner Time = new Scanner (System.in);
        System.out.println ("What is the time in minutes");
        Input = Time.nextDouble();
        //hour = Math.round (hour); //These commented lines of code...
        //remain = hour * 60; //...were used to create a guide of sorts...
        //min = Input - remain; //...in order to implement modulus.
        hourD = Input / 60;
        remain = hourD * 60;
        minD = remain % 60;
        hourD = Math.round (hourD); //The hourD variable is rounded to the nearest whole number, but still displays .0
        minD = Math.round(minD); //This variable was rounded but still displays .0
        hourI = (int) hourD; //Via typecasting, converts the hour variable into a whole number
        minI = (int) minD; //Via typecasting, converts the hour variable into a whole number
        System.out.println ("Time in Hour:Minute format: " +hourI+" : "+minI);
        Time.close();
        //Program End
    }
}
