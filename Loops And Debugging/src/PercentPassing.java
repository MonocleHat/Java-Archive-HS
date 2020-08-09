import java.util.Scanner;
//2015-11-25
public class PercentPassing {
    public static void main(String[] args) {


        int quitProgram = 0; //when user enters a number other than 1, it quits
        int percentScore = 0; //Player enters score here
        double aboveRange = 0; //amounts above 70
        double scoreEntered = 0; //amounts entered
        double percentAbove; //to be typecast into variable below
        int percentFinal; //final amount of scores over 70

        Scanner userInput = new Scanner (System.in);
        while (quitProgram !=1){
            System.out.println("Please enter a score: ");
            percentScore = userInput.nextInt();
            scoreEntered ++;
            //System.out.println("Check total entered: "+scoreEntered); (used only for testing)
            if (percentScore > 70){
                aboveRange++;
                //System.out.println("check over 70: " +aboveRange); (Used only for testing)
            }
            System.out.println("Would you like to quit program? (1 for yes, 0 for no)");
            quitProgram = userInput.nextInt();
        }
        userInput.close();
        percentAbove = aboveRange / scoreEntered;
        //System.out.println(percentAbove); (Used to check value before calculating final amount)
        percentAbove = percentAbove * 100;
        percentFinal = (int) percentAbove;
        System.out.println("out of the scores entered, " +percentFinal +" percent Scored over 70");

    }
}
