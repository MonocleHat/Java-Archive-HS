import java.util.Scanner;
public class Drawbox2 {
    public static void drawBar(int width){
        for (int i = 1; i <= width; i++) {

            System.out.print("*");

        }

        System.out.println();

    }
    public static void drawBox (int height, int width){
        for (int i = 1; i < height; i++) {

            drawBar(width);

        }


    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner userInput = new Scanner (System.in);
        int height;
        int width;
        System.out.println("Enter a height");
        height = userInput.nextInt();
        System.out.println ("Enter a width");
        width = userInput.nextInt();
        drawBar(width);
        drawBox(height,width);
    }

}
