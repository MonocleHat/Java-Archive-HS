public class Investment {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //variables
        final int END_VALUE = 5000; //End value of investment
        int startInvest = 2500; //Starting amount
        double compound =0.075; //to be compounded
        double totalAmt = 0; //Stores total amount
        int yearsInvest = 0; //Displays years invested
        totalAmt = startInvest; //The total amount is first set to the start invest amount
        do{						//Loop begins
            totalAmt = totalAmt + totalAmt*compound;
            yearsInvest++; //Incremented after total amount is compounded
        }while(totalAmt < END_VALUE); //Loop runs as long as end value is greater than the total
        System.out.println("it would take " +yearsInvest +" years to reach a total over 5000$");
    }
}
