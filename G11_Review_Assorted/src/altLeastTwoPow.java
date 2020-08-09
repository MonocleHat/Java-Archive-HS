import java.util.Scanner;
public class altLeastTwoPow {
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

        int	num = 3;
        if (num == 2){
            num = 1;
            System.out.println("Check1");
        }
        else if (num < 2){
            System.out.println("Checklessthan2");
        }
        else{
            System.out.print("CheckNoOther");
        }

        if (num == 1){
            System.out.println("Check Complete");
        }
    }
}
