import java.util.Scanner;
//Author: MonocleHat
//Original date: 2015-11-11

public class CarRecall {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int CarModel;
        Scanner CustomerPrompt = new Scanner (System.in);

        System.out.println("Enter the car's model number: ");
        CarModel = CustomerPrompt.nextInt();
        if (CarModel > 0 && CarModel < 118 || CarModel > 0 && CarModel ==118){
            System.out.println("Your car is not defective");
        }
        else if (CarModel == 119 ){
            System.out.println("Your car is defective. It must be repaired");
        }
        else if (CarModel > 120 && CarModel < 188 || CarModel ==120 || CarModel == 188){
            System.out.println ("Your car is not defective");
        }
        else if (CarModel ==189 || CarModel == 195 || CarModel >189 && CarModel <195){
            System.out.println("Your car is defective. it must be repaired");
        }
        else if (CarModel == 196 || CarModel == 220 || CarModel >196 && CarModel < 220){
            System.out.println("Your car is not defective");
        }
        else if (CarModel == 221){
            System.out.println("Your car is defective. it must be repaired");
        }
        else if (CarModel == 222 || CarModel ==779 || CarModel >222 && CarModel < 779){
            System.out.println("Your car is not defective.");
        }
        else if (CarModel == 780){
            System.out.println("Your car is defective. it must be repaired");
        }

        CustomerPrompt.close();
    }
}
