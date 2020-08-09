import java.util.Scanner;
import java.lang.Math;
//Author: MonocleHat
//Original date: 2015-11-11
public class Eggs {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double Eggs;
        final double Rate = 0.50 / 12;
        double Price;
        double Remain;
        double ExtraCost;

        Scanner UserPrompt = new Scanner (System.in);
        System.out.println ("Please enter the amount of eggs purchased");
        Eggs = UserPrompt.nextDouble();
        if (Eggs > 0 && Eggs < 47 || Eggs == 47){
            Remain = Eggs % 12;
            ExtraCost = Remain * Rate;
            Price = ExtraCost+0.50;
            Price = Math.round((Price * 100.0)) /100.0;
            System.out.println ("The amount of eggs purchased is: " +Price);

        }
        else if (Eggs == 48 || Eggs > 48 && Eggs < 71 || Eggs == 71){
            Remain = Eggs % 12;
            ExtraCost = Remain * Rate;
            Price = ExtraCost+0.45;
            Price = Math.round((Price * 100.0)) /100.0;
            System.out.println ("The amount of eggs purchased is: " +Price);
        }
        else if (Eggs == 72 || Eggs > 72 && Eggs < 131 || Eggs == 131){
            Remain = Eggs % 12;
            ExtraCost = Remain * Rate;
            Price = ExtraCost+0.40;
            Price = Math.round((Price * 100.0)) /100.0;
            System.out.println ("The amount of eggs purchased is: " +Price);
        }
        else if (Eggs == 132 || Eggs > 132){
            Remain = Eggs % 12;
            ExtraCost = Remain * Rate;
            Price = ExtraCost+0.35;
            Price = Math.round((Price * 100.0)) /100.0;
            System.out.println ("The amount of eggs purchased is: " +Price);
        }
        UserPrompt.close();
    }
}
