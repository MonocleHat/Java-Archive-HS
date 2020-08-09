import java.util.*;
//Author: Brandyn "MonocleHat"
//Original Date: 2016/02/29
public class PayStub {
    public static double incomeTax(double grossPay){ //Method calculates income tax deductable
        double annualPay = 0; //Display yearly pay
        double temp = 0; //temp variable, used in calculating yearly pay
        double taxDeduct = 0; //Value of tax deduction
        temp = grossPay * 2; //calculates monthly pay
        annualPay = temp * 26; //Calculates annual pay

        //The following "If/Else if" calculates tax deductions, based on tax rates for different salaries earned. then rounds it to two decimal spaces.
        if (annualPay < 41536){
            taxDeduct = grossPay * 0.2005;
            taxDeduct = Math.round(taxDeduct * 100.0) / 100.0;
            System.out.println("Income tax deducted: " +taxDeduct +"$");
        }else if (annualPay >= 41546 && annualPay < 45282){
            taxDeduct = grossPay * 0.2415;
            taxDeduct = Math.round(taxDeduct * 100.0) / 100.0;
            System.out.println("Income tax deducted: " +taxDeduct +"$");
        }else if (annualPay >= 45282 && annualPay < 73145){
            taxDeduct = grossPay * 0.2965;
            taxDeduct = Math.round(taxDeduct * 100.0) / 100.0;
            System.out.println("Income tax deducted: " +taxDeduct +"$");
        }else if (annualPay >= 73145 && annualPay < 83075){
            taxDeduct = grossPay * 0.3148;
            taxDeduct = Math.round(taxDeduct * 100.0) / 100.0;
            System.out.println("Income tax deducted: " +taxDeduct +"$");

        } else if (annualPay >= 83075 && annualPay < 86176){
            taxDeduct = grossPay * 0.3389;
            taxDeduct = Math.round(taxDeduct * 100.0) / 100.0;
            System.out.println("Income tax deducted: " +taxDeduct +"$");

        }else if (annualPay >= 86176 && annualPay < 90536){
            taxDeduct = grossPay * 0.3791;
            taxDeduct = Math.round(taxDeduct * 100.0) / 100.0;
            System.out.println("Income tax deducted: " +taxDeduct +"$");
        }else if (annualPay >= 90536 && annualPay < 140388){
            taxDeduct = grossPay * 0.4341;
            taxDeduct = Math.round(taxDeduct * 100.0) / 100.0;
            System.out.println("Income tax deducted: " +taxDeduct +"$");
        }else if (annualPay >= 140388){
            taxDeduct = grossPay * 0.4641;
            taxDeduct = Math.round(taxDeduct * 100.0) / 100.0;
            System.out.println("Income tax deducted: " +taxDeduct +"$");
        }
        return taxDeduct; //Returns tax deductable to the main method.
    }
    public static double otherDeductions(double grossPay){ //Calculates EI and CPP Deductions.
        double EI = 0;
        double CPP = 0;
        CPP = grossPay * 0.0495; //Calculates value of CPP deduction by multiplying gross pay by the tax rate
        EI = grossPay * 0.0188; //Calculates value of EI by multiplying gross pay by the tax rate.
        EI = Math.round(EI * 100.0) / 100.0; //Rounding
        CPP = Math.round(CPP * 100.0) / 100.0;
        System.out.println("Employment Insurance: " +EI);
        System.out.println("Canadian Pension Plan: " +CPP);

        double otherDeductSum;
        otherDeductSum = EI + CPP; //Calculates the total amount of money being deducted for the EI and CPP
        return otherDeductSum;//Returns to main method
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double rateOfPay; //Stores money earned per hour
        double hourWorked; //Hours worked in a 2 week period
        double grossPay; //Payment every 2 weeks.

        double taxDeduct = 0; //To store tax deductable later
        double otherDeduct = 0; //To store other deductables later
        Scanner userPrompt = new Scanner(System.in);
        System.out.println("enter time worked in past two weeks: ");
        hourWorked = userPrompt.nextDouble(); //Prompt user for time worked in past 2 weeks
        System.out.println("Enter  rate of pay (how much are you paid per hour): ");
        rateOfPay = userPrompt.nextDouble();//Prompt user for money earned per hour
        grossPay = rateOfPay * hourWorked; //Calculates gross pay, by multiplying rate by the hours worked.
        System.out.println("Youre gross pay is: " +grossPay);
        System.out.println("For this pay period - ");
        taxDeduct = incomeTax(grossPay); //Calls method incomeTax, then returns taxDeduct value to main method
        otherDeduct = otherDeductions(grossPay); //Calls method otherDeductions, then returns otherDeduct value to main method
        double totalDeduct;
        totalDeduct = otherDeduct + taxDeduct; //Calculates total deductions
        grossPay = Math.round(grossPay * 100.0) / 100.0;
        System.out.println("Gross Pay: " +grossPay); //display gross pay
        System.out.println("Total Deductions: " +totalDeduct); //Display other deductions.
        double netPay = grossPay - totalDeduct; //Calculates net pay after deductions
        netPay = Math.round(netPay * 100.0) / 100.0; //rounding
        System.out.println("NET Pay: " +netPay); //Display netpay
        userPrompt.close(); //Close input stream
    }
}
