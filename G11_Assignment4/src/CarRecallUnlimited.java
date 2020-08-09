import java.util.Scanner;
public class CarRecallUnlimited {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int SENTINEL;//Model number variable
        Scanner CustomerPrompt = new Scanner (System.in);//Input stream opens
        do{ //Loop begins. runs as long as model number isnt 0 (The number used to exit)


            System.out.println("Enter the car's model number or enter 0 to quit: ");
            SENTINEL = CustomerPrompt.nextInt(); //User enters a number
            //Program will scan through various conditions before returning to above statement to ask user for number

            if (SENTINEL > 0 && SENTINEL < 118 || SENTINEL > 0 && SENTINEL ==118){
                System.out.println("Your car is not defective");
            }
            else if (SENTINEL == 119 ){
                System.out.println("Your car is defective. It must be repaired");
            }
            else if (SENTINEL > 120 && SENTINEL < 188 || SENTINEL ==120 || SENTINEL == 188){
                System.out.println ("Your car is not defective");
            }
            else if (SENTINEL ==189 || SENTINEL == 195 || SENTINEL >189 && SENTINEL <195){
                System.out.println("Your car is defective. it must be repaired");
            }
            else if (SENTINEL == 196 || SENTINEL == 220 || SENTINEL >196 && SENTINEL < 220){
                System.out.println("Your car is not defective");
            }
            else if (SENTINEL == 221){
                System.out.println("Your car is defective. it must be repaired");
            }
            else if (SENTINEL == 222 || SENTINEL ==779 || SENTINEL >222 && SENTINEL < 779){
                System.out.println("Your car is not defective.");
            }
            else if (SENTINEL == 780){
                System.out.println("Your car is defective. it must be repaired");
            }
        }while (SENTINEL !=0);//Program ends when user enters zero to quit
        System.out.println("Please stand by."); //a message the program is quitting is displayed
        CustomerPrompt.close(); //input stream closes

        //the below code delays the program, and continues it after a set amount of time
        //in this case, Thread.sleep (2000) delays it for 2 seconds.

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
        System.out.println("Program Quit");//Last message is displayed before program terminates.
    }
}
