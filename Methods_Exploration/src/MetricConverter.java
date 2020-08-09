import java.util.*;
public class MetricConverter {
    /**
     * convert a number from inches to centimeters
     * pre: userNum > 0, convertedNum = 0
     * post: userNum is converted from centimeters to inches,
     * value is displayed
     */
    public static void inchToCentimeter (double convertedNum, double userNum){
        System.out.println("");
        System.out.println("Your number in Inches: " +userNum);
        convertedNum = userNum * 2.54;
        System.out.println ("Your number in Centimeters: " +convertedNum);
    }
    /**
     * convert a number from feet to Centimeters
     * pre: userNum > 0, convertedNum = 0
     * post: userNum is converted from feet to Centimeters,
     * value is displayed
     */
    public static void feetToCentimeter (double convertedNum, double userNum){
        System.out.println("");
        System.out.println("Your number in Feet: " +userNum);
        convertedNum = userNum * 30;
        System.out.println ("Your number in Centimeters: " +convertedNum);
    }
    /**
     * convert a number from Yards to meters
     * pre: userNum > 0, convertedNum = 0
     * post: userNum is converted from yards to meters,
     * value is displayed
     */
    public static void yardsToMeter (double convertedNum, double userNum){
        System.out.println("");
        System.out.println("Your number in Yards: " +userNum);
        convertedNum = userNum * 0.91;
        System.out.println ("Your number in Meters: " +convertedNum);
    }
    /**
     * convert a number from miles to kilometers
     * pre: userNum > 0, convertedNum = 0
     * post: userNum is converted from miles to kilometers,
     * value is displayed
     */
    public static void mileToKilometer (double convertedNum, double userNum){
        System.out.println("");
        System.out.println("Your number in Miles: " +userNum);
        convertedNum = userNum * 1.6;
        System.out.println ("Your number in Kilometers: " +convertedNum);
    }
    /**
     * convert a number from centimeters to Inches
     * pre: userNum > 0, convertedNum = 0
     * post: userNum is converted from centimeters to inches,
     * value is displayed
     */
    public static void centimetersToInches (double convertedNum, double userNum){
        System.out.println("");
        System.out.println("Your number in Centimeters: " +userNum);
        convertedNum = userNum / 2.54;
        System.out.println ("Your number in Inches: " +convertedNum);
    }
    /**
     * convert a number from centimeters to feet
     * pre: userNum > 0, convertedNum = 0
     * post: userNum is converted from centimeters to feet,
     * value is displayed
     */
    public static void centimetersToFeet (double convertedNum, double userNum){
        System.out.println("");
        System.out.println("Your number in Centimeters: " +userNum);
        convertedNum = userNum / 30;
        System.out.println ("Your number in Feet: " +convertedNum);
    }
    /**
     * convert a number from meters to Yards
     * pre: userNum > 0, convertedNum = 0
     * post: userNum is converted from meters to yards,
     * value is displayed
     */
    public static void metersToYards (double convertedNum, double userNum){
        System.out.println("");
        System.out.println("Your number in Meters: " +userNum);
        convertedNum = userNum / 0.91;
        System.out.println ("Your number in Yards: " +convertedNum);
    }
    /**
     * convert a number from kilometers to miles
     * pre: userNum > 0, convertedNum = 0
     * post: userNum is converted from kilometers to miles,
     * value is displayed
     */
    public static void kilometersToMiles (double convertedNum, double userNum){
        System.out.println("");
        System.out.println("Your number in Kilometers: " +userNum);
        convertedNum = userNum / 1.6;
        System.out.println ("Your number in Miles: " +convertedNum);
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner userInput = new Scanner (System.in); //Opens scanner
        double userNum; //Stores number provided by user.
        int userChoice;
        double convertedNum = 0;

        System.out.print("Please enter a number to convert: ");
        userNum = userInput.nextDouble();

        System.out.format("%10s %25s%n", "1.Inches to Centimeters", "5.Centimeters to inches");
        System.out.format("%10s %25s%n", "2.Feet to Centimeters", "6.Centimeters to Feet");
        System.out.format("%10s %25s%n", "3.Yards to Meters", "7.Meters to Yards");
        System.out.format("%10s %25s%n", "4.Miles to Kilometers", "8.Kilometers to Miles");

        System.out.print("Please enter a conversion type: ");
        userChoice = userInput.nextInt();

        if (userChoice == 1){
            inchToCentimeter(convertedNum, userNum);
        }else if (userChoice ==2){
            feetToCentimeter(convertedNum,userNum);
        }else if (userChoice ==3){
            yardsToMeter(convertedNum,userNum);
        }else if (userChoice ==4){
            mileToKilometer(convertedNum,userNum);
        }else if (userChoice ==5){
            centimetersToInches(convertedNum,userNum);
        }else if (userChoice ==6){
            centimetersToFeet(convertedNum,userNum);
        }else if (userChoice ==7){
            metersToYards(convertedNum,userNum);
        }else if (userChoice ==8){
            kilometersToMiles(convertedNum,userNum);
        }

        userInput.close();
    }
}
