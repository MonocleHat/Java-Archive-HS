import java.util.*;
public class Arrays_DiceRoll {
    public static void main(String[] args) {

        int numRolls;
        int sum;
        Scanner input = new Scanner(System.in);
        int[] diceRolls; //declare array
        diceRolls = new int[19]; //Max sum of dice is 12. so array space is 13

        System.out.println("How many rolls? ");
        numRolls = input.nextInt();
        for (int i=0; i<numRolls;i++){
            Random rand = new Random();
            sum =(rand.nextInt(6)+1) + (rand.nextInt(6)+1) + (rand.nextInt(6)+1);
            diceRolls[sum]+=1;
        }
        System.out.println ("The outcome of " +numRolls +" Rolls is");
        for (int j=3; j < 19; j++){
            System.out.println(j +":"+diceRolls[j]);
        }
        input.close();
    }
}
