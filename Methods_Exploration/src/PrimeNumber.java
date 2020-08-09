import java.util.*;
public class PrimeNumber {
    public static boolean isPrime (int userNum){
        boolean prime = false;

        if (userNum %2!=0 || userNum %3!=0|| userNum %5!=0||userNum %7!=0||userNum %11!=0){
            prime = true;
        }

        return prime;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int userNum;
        int loopCounter = 2;
        Scanner userPrompt = new Scanner (System.in);

        System.out.print("Enter a number: ");
        userNum = userPrompt.nextInt();

        while (userNum>0){
            if (userNum % loopCounter ==0){
                isPrime(userNum);
                break;
            }else if (userNum% loopCounter != 0){
                isPrime(userNum);
                break;
            }

        }
        if (isPrime(userNum)==true){
            System.out.println ("Number isnt prime");
        }else if (isPrime(userNum)==false){
            System.out.println ("Number is Prime");
        }
    }
}
