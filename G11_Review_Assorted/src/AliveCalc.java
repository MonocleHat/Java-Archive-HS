import java.util.Scanner;
public class AliveCalc {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner userPrompt = new Scanner(System.in);
        /*values with no variables
         * Hours sleeping = 8
         * time in a month = 30 days
         * 365 days
         */

        int yearBorn;
        int monthBorn;
        int dayBorn;

        System.out.println("Enter your birthdate (year, then month, then day)");
        yearBorn = userPrompt.nextInt();
        monthBorn = userPrompt.nextInt();
        dayBorn = userPrompt.nextInt();

        int yearCurrent;
        int monthCurrent;
        int dayCurrent;

        System.out.println("Enter the current date (year, month, day)");
        yearCurrent = userPrompt.nextInt();
        monthCurrent = userPrompt.nextInt();
        dayCurrent = userPrompt.nextInt();

        int yearsAlive;
        int monthsAlive = 0;
        int daysAlive;

        yearsAlive = yearCurrent - yearBorn;
        if (monthCurrent != monthBorn && monthCurrent > monthBorn){
            monthsAlive = monthCurrent - monthBorn;
            System.out.print("S1");
        }else if (monthCurrent!= monthBorn && monthBorn > monthCurrent){
            monthsAlive = monthBorn - monthCurrent;
            System.out.print("S2");
        }else if (monthCurrent == monthBorn){
            monthsAlive = monthBorn;
            System.out.print("S3");
        }

        daysAlive = 365 * yearsAlive;
        daysAlive = daysAlive + (30 * monthsAlive);
        daysAlive = daysAlive - (30 * (12 - monthsAlive));
        System.out.println(daysAlive);

    }
}
