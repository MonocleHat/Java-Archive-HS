import java.util.*;
/*
Original Date: 2016-05-17
Author: MonocleHat
Errata: Incomplete project; unsure of what the original instructions were to complete and never recieved any bit of
direction to finish it up; dont really have any interest in finishing it really, considering i tend to get confused by
most of this code. It feels extremely unorganized with very little proper structure. I could probably remake it if i
ever wanted to however. but probably not any time soon considering i need to prep for my next semesters.
 */
public class BestPrice {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int productCode;
        int findItem;
        Scanner userInput = new Scanner (System.in);
        System.out.println("Best Price Applet");
        System.out.print("Enter the product code: ");
        productCode = userInput.nextInt();
//calculations below

        String[] foodItems ={"Beef Burgers", "Turkey Meatballs","Chicken Fingers","Fish Fillet","Shrimp Skewers","Veggies Kabobs","Spring Rolls","Pork Chops"};
        int []produceCode ={105,244,319,476,511,626,759,809};
        double[]storeA ={11.49,11.99,8.49,10.99,14.99,5.99,7.49, 8.99};
        double[]storeB ={10.50,12.25,8.25,9.75,13.75,5.50,8.75,8.75};
        double[]storeC ={11.00,12.00,8.00,10.00,12.00,5.00,8.00,9.00};
        double[]storeD ={14.29,10.89,7.49,10.39,12.09,5.89,7.49,8.99};
        double[]storeE ={13.77,11.77,8.77,9.77,12.77,5.77,7.77,8.77};
        double priceA = 0;
        double priceB = 0;
        double priceC = 0;
        double priceD = 0;
        double priceE = 0;
        int numberItems;
        numberItems = foodItems.length;
        String productName = null;
        for (int i = 0; i< numberItems ; i++){
            if (productCode == produceCode[i]){
                findItem = 1;
                priceA = storeA[i];
                priceB = storeB[i];
                priceC = storeC[i];
                priceD = storeD[i];
                priceE = storeE[i];
                productName = foodItems[i];
            }
        }
        double[]priceArray = {priceA,priceB,priceC,priceD,priceE};
        int numberPrices = priceArray.length;
        double min = 100;
        String[] storeArray = {"StoreA","StoreB","StoreC","StoreD","StoreE"};
        int nameLength = storeArray.length;
        int j = 0;
        String nameStore = null;
        for (int i = 0; i < priceArray.length; i++){

            min = Math.min(priceArray[i], min);
            if (min < min){
                j = i;
            }

        }
        nameStore = storeArray[j];
        System.out.println(min +nameStore);
//double temp;
//for (int i = 0; i < (priceArray.length - 1); i++){
//	for (int j = 0; j < (priceArray.length - 1); j++){
//
//
//		if (priceArray[j] >priceArray[j+1]){
//			temp = priceArray[j];
//			priceArray[j] =priceArray[j+1];
//			priceArray[j+1] = temp;
//
//		}
//	}
//
//}

        System.out.println("Product: " +productName);
        System.out.println("PriceLowest: " +min +"  ...At store...(And thats the problem...how do i display the store?");
/*for (int i = 0; i<numberItems; i++){
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
}*/
    }
}
