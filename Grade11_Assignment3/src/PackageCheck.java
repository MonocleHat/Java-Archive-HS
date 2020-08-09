import java.util.Scanner;
//Author: MonocleHat
//Original Date: 2015-11-11
public class PackageCheck {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int weight;
        int height;
        int length;
        int width;
        int volume;
        Scanner userPrompt = new Scanner (System.in);
        System.out.println("Enter Package weight in kg: ");
        weight = userPrompt.nextInt();
        System.out.println("Enter Package length: ");
        length = userPrompt.nextInt();
        System.out.println ("Enter Package Height: ");
        height = userPrompt.nextInt();
        System.out.println ("Enter package Width: ");
        width = userPrompt.nextInt();
        volume = height * width * length;

        if (weight > 27){
            System.out.println("Package exceeds 27kg, is too heavy");
        } else if (volume > 100000){
            System.out.println ("Package exceeds 0.1 cubic metre size limit, is too large.");

        } else if (volume < 100000 && weight < 27 || volume == 100000 || weight == 27){
            System.out.println("Your package has been accepted.");
        }

        userPrompt.close();
    }
}
