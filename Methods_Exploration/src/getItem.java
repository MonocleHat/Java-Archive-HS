import java.util.*;
public class getItem {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        int productNumber;
        int findItem;
        System.out.println("Enter the product number: ");
        productNumber = input.nextInt();
        checkInventory(productNumber);
    }

    public static void checkInventory(int productNumber){
        int[] validItems = {101, 108, 201, 213, 266, 304, 311, 409, 411, 489};
        double[] prices = {0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00};
        int[]inventory = { 29,30,4,5,6,10,7,12,45,11};
        int numberItems = validItems.length;
        double price=0;
        int findItem = 0;
        int inStock =0;
        for (int i = 0; i<numberItems; i++){
            if(productNumber == validItems[i]){
                findItem = 1;
                price = prices[i];
                inStock = inventory[i];
            }
        }
        if (findItem == 1){
            System.out.println("That item is in the inventory");
            System.out.printf("The price of the item is $%.2f%n", price);
            System.out.println ("Number of items in stock: " +inStock);
        } else {
            System.out.println("The item is not in the inventory");
        }

    }
}
