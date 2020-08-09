import java.util.Scanner;
public class leastTwoPowers {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner userPrompt = new Scanner (System.in);
        int x;
        double y =0;
        double counter = -1;
        x = userPrompt.nextInt();


        do{
            counter++;
        }while (Math.pow(2, counter) < x);

        y = Math.pow(2,counter);
        System.out.println(y);

        userPrompt.close();
    }
}
