import java.util.Scanner;
public class ModifiedAVG {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double numInput = 0;
        double inputCounter= 0;
        double numContain = 0;
        double avg;
        Scanner userPrompt = new Scanner (System.in);
        System.out.println("Enter numbers");
        while (numInput != -1){

            numInput = userPrompt.nextDouble();

            numContain = numContain + numInput;
            inputCounter++;

            if (numInput ==-1){
                avg = (numContain + 1) / (inputCounter - 1);
                System.out.println("Average:" +avg);
            }
        }
    }
}
