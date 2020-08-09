import java.util.Scanner;
//Author: MonocleHat
//Original date: 2015-11-11
public class Grades {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int Percentage;

        Scanner GradeInput = new Scanner (System.in);
        System.out.println ("Please enter the precentage earned: ");
        Percentage = GradeInput.nextInt();
        if (Percentage < 50){
            System.out.println ("The corresponding letter grade is: F");
        }
        else if (Percentage == 50 || Percentage > 50 && Percentage < 54 || Percentage == 54){
            System.out.println ("The corresponding letter grade is: D-");
        }
        else if (Percentage == 55){
            System.out.println ("The corresponding letter grade is: D");
        }
        else if (Percentage == 56 || Percentage >56 && Percentage < 59 || Percentage == 59){
            System.out.println ("The corresponding letter grade is: D+");
        }
        else if (Percentage == 60 || Percentage >60 && Percentage < 64 || Percentage == 64){
            System.out.println ("The corresponding letter grade is: C-");
        }
        else if (Percentage == 65){
            System.out.println ("The corresponding letter grade is: C");
        }
        else if (Percentage == 66 || Percentage > 66 && Percentage < 69 || Percentage == 69){
            System.out.println ("The corresponding letter grade is: C+");
        }
        else if (Percentage == 70 || Percentage > 70 && Percentage < 74 || Percentage == 74){
            System.out.println ("The corresponding letter grade is: B-");
        }
        else if (Percentage == 75){
            System.out.println ("The corresponding letter grade is: B");
        }
        else if (Percentage == 76 || Percentage > 76 && Percentage < 79 || Percentage == 79){
            System.out.println ("The corresponding letter grade is: B+");
        }
        else if (Percentage == 80 || Percentage > 80 && Percentage < 84 || Percentage == 84){
            System.out.println ("The corresponding letter grade is: A-");
        }
        else if (Percentage == 85){
            System.out.println ("The corresponding letter grade is: A");
        }
        else if (Percentage == 86 || Percentage > 86 && Percentage < 100 || Percentage == 100){
            System.out.println ("The corresponding letter grade is: A+");
        }
        GradeInput.close();
    }
}
