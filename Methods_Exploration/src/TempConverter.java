import java.util.Scanner;
public class TempConverter {
    public static void farenToCelsius(){
        double fTemp, cTemp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit temperature: ");
        fTemp = input.nextDouble();
        input.close();
        cTemp = (double)5/(double)9*(fTemp - 32);
        System.out.println("The Celsius temperature is " + cTemp);
    }
    public static void celToFarenheit(){
        double fTemp, cTemp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit temperature: ");
        cTemp = input.nextDouble();
        input.close();
        fTemp = cTemp * 9 / 5 + 32;
        System.out.println("The Celsius temperature is " + fTemp);

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int choice;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter choice");

        System.out.println("1.Fahrenheit to celsius conversion");
        System.out.println ("2.Celsius to farenheit conversion");

        choice = userInput.nextInt();
        if (choice ==1){
            farenToCelsius();
        }else{
            celToFarenheit();
        }
    }
}
