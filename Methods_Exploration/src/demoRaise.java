import java.util.*;
//Author: MonocleHat
//OriginalDate: 2016-04-21
public class demoRaise {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner userInput = new Scanner (System.in);
        double percentRaise;
        System.out.println ("Enter the raise as a percent: ");
        percentRaise = userInput.nextDouble();
        double Employee1 = 45000;
        double Employee2 = 29000;
        System.out.println("Demonstration of pay raises: ");
        //double raise1 = Employee1*1.10;
        predictRaise(Employee1,percentRaise);
        predictRaise(Employee2,percentRaise);
        predictRaise(30000,percentRaise);

    }

    public static void predictRaise(double oldSalary,double percentRaise){
        double newSalary;
        newSalary = oldSalary*(1+percentRaise/100);
        System.out.printf("With a raise, the new salary is: $%.2f%n ", newSalary);

    }
}
