import java.util.Scanner;
public class addDigits {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String digitSum = new String();
        Scanner userPrompt = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        digitSum = userPrompt.nextLine();
        char [] AC = digitSum.toCharArray();
        int sum = 0;
        for (int i = 0; i<AC.length;i++){
            if (AC[i] == 48){
                sum = sum + 0;
            }
            if (AC[i] == 49){
                sum = sum + 1;
            }
            if (AC[i] == 50){
                sum = sum + 2;
            }
            if (AC[i] == 51){
                sum = sum + 3;
            }
            if (AC[i] == 52){
                sum = sum + 4;
            }
            if (AC[i] == 53){
                sum = sum + 5;
            }
            if (AC[i] == 54){
                sum = sum + 6;
            }
            if (AC[i] == 55){
                sum = sum + 7;
            }
            if (AC[i] == 56){
                sum = sum + 8;
            }
            if (AC[i] == 57){
                sum = sum + 9;
            }
        }
        System.out.println(sum);

    }
}
