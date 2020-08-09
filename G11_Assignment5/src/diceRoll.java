public class diceRoll {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double OP1 = 6; //Highest number on die
        double OP2 = 1; //Lowest number on die
        int diceRoll;//Stores value of dice roll
//Below variables count the times a number is rolled.
        int oneRoll = 0;
        int twoRoll = 0;
        int threeRoll = 0;
        int fourRoll = 0;
        int fiveRoll = 0;
        int sixRoll = 0;
//Stores probability of rolled numbers below
        double oneProb;
        double twoProb;
        double threeProb;
        double fourProb;
        double fiveProb;
        double sixProb;
        int loopCount = 0; //Loop iteration count

        do{ //Do while simulates rolls.
            loopCount++;
            diceRoll = (int) ((OP1 - OP2 + 1 ) * Math.random() + OP2); //Randomizes  and chooses number within the range.
            if (diceRoll == 1){
                oneRoll++;
            }
            if (diceRoll == 2){
                twoRoll++;
            }
            if (diceRoll == 3){
                threeRoll++;
            }
            if (diceRoll == 4){
                fourRoll++;
            }
            if (diceRoll == 5){
                fiveRoll++;
            }
            if (diceRoll == 6){
                sixRoll++;
            }
        }while(loopCount != 100); //Loop ends when one hundred rolls have been completed.

        System.out.println(oneRoll +" Out of 100 rolls is a one");
        oneProb = oneRoll * 100 / 100; //Calculates the percentage
        System.out.println("The probability of rolling 1 is: " +oneProb +" out of 100 rolls");
        System.out.println(" ");

        System.out.println(twoRoll+" Out of 100 rolls is a two");
        twoProb = twoRoll * 100 / 100;
        System.out.println("The probability of rolling 2 is: " +twoProb +" out of 100 rolls");
        System.out.println(" ");

        System.out.println(threeRoll+" Out of 100 rolls is a three");
        threeProb = threeRoll * 100 / 100;
        System.out.println("The probability of rolling 3 is: " +threeProb +" out of 100 rolls");
        System.out.println(" ");

        System.out.println(fourRoll+" Out of 100 rolls is a four");
        fourProb = fourRoll * 100 / 100;
        System.out.println("The probability of rolling 4 is: " +fourProb +" out of 100 rolls");
        System.out.println(" ");

        System.out.println(fiveRoll+" Out of 100 rolls is a five");
        fiveProb = fiveRoll * 100 / 100;
        System.out.println("The probability of rolling 5 is: " +fiveProb +" out of 100 rolls");
        System.out.println(" ");

        System.out.println(sixRoll+" Out of 100 rolls is a six");
        sixProb = sixRoll * 100 / 100;
        System.out.println("The probability of rolling 6 is: " +sixProb +" out of 100 rolls");
    }
}
