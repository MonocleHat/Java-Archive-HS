import java.util.*;
public class BestPrice_Redux {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int productCode; //user determined, represents the item code of a product
        int findItem = 0; //When a product is found, this is set to one. (used as flag)
        int []produceCode ={105,244,319,476,511,626,759,809}; //Array stores product codes
        Scanner userInput = new Scanner (System.in);
        System.out.println("Best Price Applet");
        do{ //Do/while loop, loops until a user enters a number that is within the produceCode array
            System.out.print("Enter the product code. If it is not in the inventory, you will be prompted to retry: ");
            productCode = userInput.nextInt();
            for (int i = 0; i < produceCode.length;i++){
                if (productCode == produceCode[i]){
                    findItem = 1;
                    i=7;
                    break; //Leave for loop
                }
            }
        }while (findItem != 1); //Runs while find item is not 1.


        //calculations below
        String[] foodItems ={"Beef Burgers", "Turkey Meatballs","Chicken Fingers","Fish Fillet","Shrimp Skewers","Veggies Kabobs","Spring Rolls","Pork Chops"}; //Stores product names in an array
        //Below variables store prices at the individual stores
        double[]storeA ={11.49,11.99,8.49,10.99,14.99,5.99,7.49, 8.99};
        double[]storeB ={10.50,12.25,8.25,9.75,13.75,5.50,8.75,8.75};
        double[]storeC ={11.00,12.00,8.00,10.00,12.00,5.00,8.00,9.00};
        double[]storeD ={14.29,10.89,7.49,10.39,12.09,5.89,7.49,8.99};
        double[]storeE ={13.77,11.77,8.77,9.77,12.77,5.77,7.77,8.77};
        //When an item is entered, the price of the item is stored in the below variables, for each store.
        double priceA = 0;
        double priceB = 0;
        double priceC = 0;
        double priceD = 0;
        double priceE = 0;
        int numberItems; //used to traverse the string array 'foodItems'
        numberItems = foodItems.length; //gives the length of the array foodItems to numberItems variable
        String productName = null;
        for (int i = 0; i< numberItems ; i++){ //For loop traverses the array foodItems until the product code entered is found in the array
            if (productCode == produceCode[i]){ //Loop assigns the prices of the item at code 'i' across various stores, to variables for each store.
                findItem = 1;
                priceA = storeA[i];
                priceB = storeB[i];
                priceC = storeC[i];
                priceD = storeD[i];
                priceE = storeE[i];
                productName = foodItems[i]; //Product name string is equal to the item at position i
            }
        }
        //Finding the lowest price
        //The following creates an array of prices for a product
        //It then determines the minimum price out of all the prices listed for a product
        double[]priceArray = {priceA,priceB,priceC,priceD,priceE};
        double min = 100;
        int indexNum = 0;
        String lowPriceName = null;
        for (int i = 0; i < priceArray.length; i++){
            min = Math.min(priceArray[i], min);

        }
        for (int i = 0; i < priceArray.length; i++){ //If the minimum value is equal to the price array before sorting, value I is given to index num
            if (min == priceArray[i]){
                indexNum = i;
            }

        }
        String [] storeName = {"Store A","StoreB","StoreC","StoreD","StoreE"}; //stores name of stores

        for (int i = 0; i < priceArray.length ; i++){ //Searches the array of prices for the lowest price of a product
            if (indexNum == i){ //Based on the index number, and the length of price array, when index num is equal to i, thats the store name with the lowest prie
                lowPriceName = storeName[i]; //assigns the value of storeName at position i, the store with the lowest price, to lowPriceName
                break;
            }
        }		if (findItem == 1){	//If find item is one, display product name, minimum price, and store name with the lowest price. item is in inventory
            System.out.println("Product: " +productName);
            System.out.println("PriceLowest: " +min + " at: " +lowPriceName);
            System.out.println("That item is in the inventory");

        }else{ //Item is not here if find item is 1.
            System.out.println("That item is not here");
        }
        userInput.close(); //close input stream
    }
}
