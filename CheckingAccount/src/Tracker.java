//Info
//Original Creation Date: 2016-12-04
//Author: MonocleHat
//File was used alongside Checking.java to create a small app to set up a "checking account".
//This was done in part with a quiz that was to take place on the same day as the creation of the files
//I cant quite remember what the quiz was on exactly, but i believe it was part of an introduction to the use of objects


import java.util.*;
public class Tracker {
    public static void main (String[]args){
        Scanner uPrompt = new Scanner(System.in);
        Checking a1 = new Checking();
        System.out.println("Enter info for check account");
        System.out.println("Account number:");
        a1.setAcctNum(uPrompt.nextInt());
        System.out.println("name of the account holder: ");
        a1.setAcctHolder(uPrompt.next());
        System.out.println();
        System.out.println("Current balance:");
        a1.setCurBalance(uPrompt.nextDouble());

        Checking a2 = new Checking();
        System.out.println("Enter info for check account");

        System.out.println("Account number:");
        a2.setAcctNum(uPrompt.nextInt());

        System.out.println("name of the account holder: ");
        a2.setAcctHolder(uPrompt.next());

        System.out.println("Current balance:");
        a2.setCurBalance(uPrompt.nextDouble());

        //questions
        if (a1.equals(a2)){
            System.out.println("These accounts are the same");
        }else{
            System.out.println("These accounts arent the same");
            System.out.println("The account with the higher balance: " +a1.compareTo(a2));
        }
        int depAmt = 0;
        int acctDep = 0;
        System.out.println("Deposit to account #: ");
        acctDep = uPrompt.nextInt();
        if (acctDep == a1.getAcctNum()){
            System.out.println("Enter an amount to deposit: ");
            a1.deposit(uPrompt.nextDouble());
        }else if (acctDep == a2.getAcctNum()){
            System.out.println("Enter an amount to deposit: ");
            a2.deposit(uPrompt.nextDouble());
        }
        int checkDep = 0;
        System.out.println("Process check to account #: ");
        acctDep = uPrompt.nextInt();

        if (acctDep == a1.getAcctNum()){
            System.out.println("Enter check amt: ");
            a1.processCheck(uPrompt.nextDouble());
        }else if (acctDep == a2.getAcctNum()){
            System.out.println("Enter check amt: ");
            a2.processCheck(uPrompt.nextDouble());
        }
        int acctOv = 0;
        System.out.println("# of acct you wish to check for overdraft? : ");
        acctOv = uPrompt.nextInt();
        System.out.println("Accts with overdraft");
        if (a1.acctOverdraft(a2) == true){
            System.out.println(a1.toStr());
        }else{
            System.out.println(a2.toStr());
        }




    }
}
