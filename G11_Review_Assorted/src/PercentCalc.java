import java.util.Scanner;
public class PercentCalc {
    public static void main(String[]args){
        Scanner userMark = new Scanner(System.in);
        double mark;
        double total;
        System.out.println("Enter the total marks");
        total = userMark.nextDouble();
        System.out.println("Enter the student's marks");
        mark = userMark.nextDouble();
        mark = calcPercent(mark,total);

        System.out.println("Student mark: " +mark);
    }
    public static double calcPercent (double total,double mark){
        double sum;
        sum = total / mark * 100;
        sum = Math.round(sum*100) /100.0;
        mark = sum;
        return mark;

    }
}
