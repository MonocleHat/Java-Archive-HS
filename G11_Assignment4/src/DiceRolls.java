import java.util.Scanner;
public class DiceRolls {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Variables
        int dice1Rand = 1; //Lowest number on a die
        int dice2Rand = 6; //Highest number on a die
        int dice1Roll; //value of first roll
        int dice2Roll; //Value of second roll
        int diceTotal; //Holds value of sum of both rolls
        int loopCount = 0; //keeps track of loop iterations


        System.out.format("%10s %10s %10s%n", "Dice1", "Dice 2", "Total");//Start of chart
        do { //Loop begins, conditions: runs as long as loop counter is less than 5
            dice1Roll = (int) ((dice2Rand - dice1Rand +1 ) * Math.random()+ dice1Rand); //Randomizes first roll
            dice2Roll = (int) ((dice2Rand - dice1Rand +1 ) * Math.random()+ dice1Rand); //Randomizes second roll
            diceTotal = dice2Roll + dice1Roll;//Adds both roll values
            System.out.format("%10s %10s %10s%n", +dice1Roll, +dice2Roll, +diceTotal);	//Adds to chart
            loopCount++; //Increments for every iteration

        }while (loopCount < 5); //Condition of while loop
    }
}
