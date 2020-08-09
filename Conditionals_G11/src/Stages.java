import java.util.Scanner;

//Author: MonocleHat
//Original Date: 2015-10-21
public class Stages {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int Age;
        Scanner AgeInput = new Scanner (System.in);
        System.out.println("Please enter your Age");
        Age = AgeInput.nextInt();

        if (Age > 18){
            System.out.println("Adult");

        }
        else if (Age <= 5){
            System.out.println ("Toddler");

        }
        else if (Age <=10){
            System.out.println("Child");

        }
        else if (Age <= 12){
            System.out.println("Preteen");
        }
        else if (Age > 12){
            System.out.println("Teen");
        }
    }
}
