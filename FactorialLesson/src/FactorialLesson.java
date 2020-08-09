import java.util.Scanner;
//Author: MonocleHat
//Original Date: 2017-05-01
public class FactorialLesson {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        n = scan.nextInt();
        System.out.println("the factorial of " +n +" is " +factorial(n));
    }

    public static int factorial(int n) {
        int ans = 1;
        //base case
        if (n == 1 || n == 0) {
            return ans;
        } else {
            ans = n * factorial(n - 1);
            return ans;
        }

    }
}
