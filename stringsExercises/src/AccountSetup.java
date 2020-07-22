import java.util.Scanner;
public class AccountSetup {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String username = new String();
        String password = new String();
        int passcodeLength;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a username ");
        username = userInput.nextLine();
        username = username.toLowerCase();
        System.out.println (username);
        do{
            System.out.println("Enter a password that is at least 8 characters: ");
            password = userInput.next();
            passcodeLength = password.length();
        }while (passcodeLength<8);
        userInput.close();
        password=password.toLowerCase();
        System.out.println("Your username is: " +username);
        System.out.println ("Your password is: " +password);

    }

}
