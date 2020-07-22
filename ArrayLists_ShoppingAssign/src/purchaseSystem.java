/*
This file was in a project named "ArrayListLab2 ShopFromFile", and seemed incomplete. I believe the intention was to
demonstrate how one might be able to utilize an arraylist to input data. This is done via a scanner object. however it
seems as though one function is not quite functioning as intended.

Additions: While the system demonstrated usage of reading from a file i wanted to also utilize writing to a file.
The usage of FileWriter was not in the original document but is added here to create a short log of items the user had
purchased.

Usage: To use this program one must first create a file in the source directory named groceryitems.txt and populate it
with groceries the program can read from.
they must follow this pattern
<item>
<double>
<int>

Original Creation Date: 2017-02-27
Date of modification: 2020-07-22
Created by Brandyn "Tophat"
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
public class purchaseSystem {
    public static void main(String[]args) throws FileNotFoundException{
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        ArrayList<Item> cart = new ArrayList<Item>();
        File file = new File("C:\\Users\\brand\\IdeaProjects\\ArrayLists_ShoppingAssign\\src\\groceryitems.txt");
        Scanner scan = new Scanner(file);
        String keepShopping = "y";
        try{
            do{
                FileWriter writer = new FileWriter("file.txt",true);
                System.out.print("Enter name of item: ");
                itemName = scan.next();
                System.out.print("Enter unit price: ");
                itemPrice = scan.nextDouble();
                System.out.print("Enter quantity: ");
                quantity = scan.nextInt();
                item = new Item(itemName,itemPrice, quantity);
                cart.add(item);
                writer.write(item.toString());
                writer.write("\n");
                writer.close();
            }while(scan.hasNext());


        }catch(IOException filefinder){
            System.out.println("Err: Cant find file");
        }
        System.out.println("\n**********Printing Recipt**********");
        System.out.println("Name    price  quant    subtotal");
        for (int i = 0; i<cart.size(); i++){
            System.out.println(cart.get(i));
        }

        double t = 0;
        for (int i = 0; i<cart.size(); i++){
            t = t + cart.get(i).getPrice();
        }
        double tot = t;
        double tax;
        tax = 0.13 * t;
        tot = tax + t;
        System.out.println("subtotal: " + t);
        System.out.println("Tax (13%): " +tax);
        System.out.print("Total: " +tot);
    }
}
