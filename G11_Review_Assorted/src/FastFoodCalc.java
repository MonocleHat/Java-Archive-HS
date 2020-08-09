import java.util.Scanner;
public class FastFoodCalc {
    public static void main(String[] args) {
        double burgerPrice = 1.69;
        double fryPrice = 1.09;
        double sodaPrice = 0.99;
        int burgerAmount;
        int fryAmount;
        int sodaAmount;
        double priceSubtotal;
        double cashPaid;
        double cashTotal;
        double cashChange;
        double taxContainer;
        double GST;
        double PST;
        Scanner userPrompt = new Scanner (System.in);

        System.out.println("Enter the amount of Burgers ordered");
        burgerAmount = userPrompt.nextInt();
        System.out.println("Enter the amount of Fries ordered");
        fryAmount = userPrompt.nextInt();
        System.out.println("Enter the amount of Soda ordered");
        sodaAmount = userPrompt.nextInt();

        burgerPrice = burgerPrice * burgerAmount;
        fryPrice = fryPrice * fryAmount;
        sodaPrice = sodaPrice * sodaAmount;

        priceSubtotal = burgerPrice + fryPrice + sodaPrice;
        System.out.println("subtotal: " +priceSubtotal);

        taxContainer = priceSubtotal / 100;
        PST = taxContainer * 8;
        GST = taxContainer * 5;
        PST = Math.round((PST * 100.0)) /100.0;
        GST = Math.round((GST * 100.0)) /100.0;
        System.out.println("PST: " +PST);
        System.out.println("GST: " +GST);
        cashTotal = priceSubtotal + PST + GST;
        cashTotal = Math.round((cashTotal * 100.0)) /100.0;
        System.out.println("Total: " +cashTotal);

        System.out.println("Enter amount paid: ");
        cashPaid = userPrompt.nextDouble();

        cashChange = cashPaid - cashTotal;

        System.out.println("this is your change: " +cashChange);
        userPrompt.close();
    }
}
