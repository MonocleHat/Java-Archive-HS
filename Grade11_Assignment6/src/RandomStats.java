import java.util.*;
public class RandomStats {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * The code below is from an "Arrays" question
         * used to count the sum of dice being rolled
         * edited and converted to solve this question
         */
//		int numRolls;
//		int sum;
//		Scanner input = new Scanner(System.in);
//		int[] diceRolls; //declare array
//		diceRolls = new int[19]; //Max sum of dice is 12. so array space is 13
//
//		System.out.println("How many rolls? ");
//	numRolls = input.nextInt();
//	for (int i=0; i<numRolls;i++){
//		Random rand = new Random();
//		sum =(rand.nextInt(6)+1) + (rand.nextInt(6)+1) + (rand.nextInt(6)+1);
//		diceRolls[sum]+=1;
//	}
//	System.out.println ("The outcome of" +numRolls +"Rolls is");
//	for (int j=3; j < 19; j++){
//		System.out.println(j +":"+diceRolls[j]);
//	}
        //My code below

        int genNum = 500; //Total amount of times Numbers generated
        int sumGen; //Number generated between 0-9
        int[] numOccur;//Array set
        numOccur = new int [10];//Fill array from 0-9

        for (int i=0; i < genNum; i++){ //Generates numbers until I is equal to genNum(500)
            Random rand = new Random();  //sets a new variable for random number generation
            sumGen = rand.nextInt(10); //generates a 'random' number within a range of 10.
            numOccur[sumGen]+=1; //Stores result in array
        }
        System.out.format("%5s %5s%n", "Number", "Occurrences");
        for (int j=0; j < 10; j++){//output
            System.out.println(j +"      "+numOccur[j]);
        }


    }
}
