//This one was a weird study on primitive data types
//Author: Monoclehat
//Original Date: 2015-10-17
import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner temperature = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.println ("What is the Temperature?");
        celsius = temperature.nextDouble();
        fahrenheit = celsius * 9 / 5 + 32;
        System.out.println("The temperature in Celsius is: " +celsius);
        System.out.println("In faherenheit, the temperature is: " +fahrenheit);
        temperature.close();
    }
}
