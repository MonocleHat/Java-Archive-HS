import java.lang.Math;
import java.util.Scanner;
//Author: MonocleHat
//Original Date: 2015-11-11
public class MathTutor {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int Number1 = 1;
        int Number2 = 10;
        int Operator;
        double OP1 = 4;
        double OP2 = 1;
        int Equation1;
        int Equation2;
        double Answer;
        double CPUAnswer;

        Scanner UserPrompt = new Scanner (System.in);

        Equation1 = (int) ((Number1 - Number2 + 1 ) * Math.random() + Number1);
        Equation2 = (int) ((Number1 - Number2 + 1 ) * Math.random() + Number1);
        Operator = (int) ((OP1 - OP2 + 1 ) * Math.random() + OP2);
        //System.out.println(+Operator); test
        if (Operator == 1){
            System.out.println(+Equation1 +" + " +Equation2);
            CPUAnswer = Equation1 + Equation2;

            System.out.println("Enter Answer");
            Answer = UserPrompt.nextInt();
            if (Answer == CPUAnswer){
                System.out.println ("Correct!");
            }
            else if (Answer != CPUAnswer){
                System.out.println ("This answer is incorrect");
            }
        }
        else if (Operator == 2){
            System.out.println(+Equation1 +" - " +Equation2);
            CPUAnswer = Equation1 - Equation2;
            System.out.println("Enter Answer");
            Answer = UserPrompt.nextInt();
            if (Answer == CPUAnswer){
                System.out.println ("Correct!");
            }
            else if (Answer != CPUAnswer){
                System.out.println ("This answer is incorrect");
            }
        }
        else if (Operator == 3){
            System.out.println(+Equation1 +" / " +Equation2);
            CPUAnswer = Equation1 / Equation2;
            System.out.println("Enter Answer");
            Answer = UserPrompt.nextInt();
            if (Answer == CPUAnswer){
                System.out.println ("Correct!");
            }
            else if (Answer != CPUAnswer){
                System.out.println ("This answer is incorrect");
            }

        }
        else if (Operator == 4){
            System.out.println(+Equation1 +" * " +Equation2);
            CPUAnswer = Equation1 * Equation2;
            System.out.println("Enter Answer");
            Answer = UserPrompt.nextInt();
            if (Answer == CPUAnswer){
                System.out.println ("Correct!");
            }
            else if (Answer != CPUAnswer){
                System.out.println ("This answer is incorrect");
            }

        }

        UserPrompt.close();

    }
}
