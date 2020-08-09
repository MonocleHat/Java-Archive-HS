import java.util.*;
public class payStub {
    public static double incomeTax(double grossPay){
        double annualPay = 0;
        double temp = 0;
        double taxDeduct = 0;
        temp = grossPay * 2;
        annualPay = temp * 26;
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
        return taxDeduct;
    }
    public static double otherDeductions(double grossPay){
        double EI = 0;
        double CPP = 0;
        CPP = grossPay * 0.0495;
        EI = grossPay * 0.0188;
        EI = Math.round(EI * 100.0) / 100.0;
        CPP = Math.round(CPP * 100.0) / 100.0;
        System.out.println("Employment Insurance: " +EI);
        System.out.println("Canadian Pension Plan: " +CPP);

        double otherDeductSum;
        otherDeductSum = EI + CPP;
        return otherDeductSum;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double rateOfPay;
        double hourWorked;
        double grossPay;

        double taxDeduct = 0;
        double otherDeduct = 0;
        Scanner userPrompt = new Scanner(System.in);
        System.out.println("enter time worked in past two weeks: ");
        hourWorked = userPrompt.nextDouble();
        System.out.println("Enter  rate of pay (how much are you paid per hour): ");
        rateOfPay = userPrompt.nextDouble();
        grossPay = rateOfPay * hourWorked;
        System.out.println("Youre gross pay is: " +grossPay);
        System.out.println("For this pay period - ");
        //incomeTax(grossPay);
        //otherDeductions(grossPay);
        taxDeduct = incomeTax(grossPay);
        otherDeduct = otherDeductions(grossPay);
        double totalDeduct;
        totalDeduct = otherDeduct + taxDeduct;
        System.out.println("Gross Pay: " +grossPay);
        System.out.println("Total Deductions: " +totalDeduct);
        double netPay = grossPay - totalDeduct;
        System.out.println("NET Pay: " +netPay);
        userPrompt.close();
    }
}
