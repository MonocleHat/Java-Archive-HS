import java.util.Scanner;
public class Investments_1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double finalA; //Final Amount
        double initialP; //Initial Investment
        double interestR;
        double yearsT;
        double compoundN;
        Scanner userPrompt = new Scanner (System.in);

        System.out.print("Initial Investment: ");
        initialP = userPrompt.nextDouble();
        System.out.println();
        System.out.print("Interest Rate: ");
        interestR = userPrompt.nextDouble();
        System.out.println();
        System.out.print("Years to Invest: ");
        yearsT = userPrompt.nextDouble();
        System.out.println();

    }
}
