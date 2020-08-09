import java.util.*;
//2016/01/20
//MonocleHat
public class Drawbox {
    public static void drawBarCharacter(int length, String character){ //used alongside the drawBoxCustom method to create a box with custom characters
        for (int i = 1; i <= length; i++) {

            System.out.print(character);

        }

        System.out.println();

    }
    public static void drawBarDefault(int length, String character){ //
        for (int i = 1; i <= length; i++) {

            System.out.print("*");

        }

        System.out.println();


    }
    public static void drawBoxCustom (int height, int width,String character){
        for (int i = 1; i < height; i++) {

            drawBarCharacter(width,character);

        }
    }
    public static void drawBoxDefault (int height, int width, String character){

        for (int i = 1; i < height; i++) {

            drawBarDefault(width,character);

        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner userPrompt = new Scanner (System.in);
        String yesCustom =new String ("Y"); //Compared to "Response" String for Custom Character choice
        String response = new String (); //Stores response to "Custom Character?" Prompt.
        String character = new String(); //Stores custom characters (if any)
        String noCustom = new String ("N"); //Compared to "Response" String and then displays the default box
        int height; //Stores height of the box
        int width; //Stores width of the box
        //Program begins
        System.out.println("Enter a height");
        height = userPrompt.nextInt(); //Get height
        System.out.println ("Enter a width");
        width = userPrompt.nextInt(); //Get width
        System.out.println("Would you like to specify a character to display? (Y/N)");
        response = userPrompt.next(); //Get Y or N response

        if (yesCustom.equals(response)){ //If Y then: Prompt for custom character
            System.out.println("Enter a character to display");
            character = userPrompt.next(); //Prompt for custom character

            drawBarCharacter(width, character); //Calls the drawBarCharacter method
            drawBoxCustom(height,width,character); //Calls the drawBoxCustom method

        }else if (noCustom.equals(response)){ //If N then: set character string to default character
            character = "*"; //Sets to *
            drawBarDefault(width,character); //Calls the drawBarDefault method.
            drawBoxDefault(height,width,character); //Calls the drawBoxDefault method.
        }
    }
}
