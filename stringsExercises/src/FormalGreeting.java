import java.util.Scanner;

public class FormalGreeting {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String name;

        Scanner userInput = new Scanner (System.in);
        System.out.println ("Enter name and title (Ex. Mr.Smith)");
        name = userInput.next();
        if(name.startsWith("Mr") || name.equalsIgnoreCase("mr")){
            System.out.println ("Hello");
        }
        else if (name.startsWith("Ms") || name.equalsIgnoreCase("ms")){
            System.out.println("Hello, ma'am");
        }
        else if (name.startsWith("Miss") || name.equalsIgnoreCase("miss")){
            System.out.println("Hello, ma'am");
        }
        else if (name.startsWith("Mrs") || name.equalsIgnoreCase("mrs")){
            System.out.println("Hello, ma'am");
        }
        else if (name.startsWith(name)){
            System.out.println("Hello " +name);
        }
        userInput.close();
    }
}
