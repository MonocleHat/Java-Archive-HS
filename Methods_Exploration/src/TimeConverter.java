import java.util.Scanner;
public class TimeConverter {
    public static void minutesToHours(){
        double mTime, hTime; //Variables storing the times from keyboard input
        Scanner userInput = new Scanner (System.in);
        System.out.println("Enter a time in Minutes");
        mTime = userInput.nextDouble();
        userInput.close();

        hTime = mTime / 60;
        System.out.println (mTime +" minutes converted to hours is: " +hTime);

    }
    public static void hoursToMinutes(){
        Scanner userInput = new Scanner (System.in);
        double hTime, mTime; //stores value
        System.out.println("Enter a time in hours");
        hTime = userInput.nextDouble();

        mTime = hTime * 60;
        System.out.println(hTime +" hours converted to minutes is: " +mTime);
    }
    public static void hoursToDays(){
        Scanner userInput = new Scanner (System.in);
        double hTime, dTime; //Stores value of hours and days
        System.out.println("Enter time in hours");
        hTime = userInput.nextDouble();

        dTime = hTime / 24;
        System.out.println(hTime +" hours converted to days is: " +dTime);
    }
    public static void daysToHours(){
        Scanner userInput = new Scanner (System.in);
        double dTime,hTime; //Stores value for days and hours
        System.out.println("Enter amount of days");
        dTime = userInput.nextDouble();

        hTime = dTime * 24;
        System.out.println(dTime +" days converted to hours is: " +hTime);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int convertChoice; //Stores choice of conversion
        Scanner userPick = new Scanner (System.in);
        System.out.println("Please choose a conversion type");
        //Prompt for conversion
        System.out.println("1.Minutes to hours");
        System.out.println("2.Hours to Minutes");
        System.out.println("3.Days to Hours");
        System.out.println("4.Hours to Days");
        convertChoice = userPick.nextInt();
        if (convertChoice == 1){
            minutesToHours();
        }else if (convertChoice == 2){
            hoursToMinutes();
        }else if (convertChoice ==3){
            hoursToDays();
        }else if (convertChoice == 4){
            daysToHours();
        }
    }
}
