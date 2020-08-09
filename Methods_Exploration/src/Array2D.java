/*
So this set of stuff was from a weird "study" thing on Methods in java. Occasionally our classes would do this thing
where we'd review certain facets of java by focusing on a large set of questions to solve. weirdly enough these all
had various sets of dates ranging at earliest from january 14th 2016 to may 17th 2016.
Original Date: 2016/05/13
Author: MonocleHat

Errata/Unfixables: Unfortunately, while it correctly displays the name after a few modifications, im not entirely sure
how the original program was supposed to work. the structure of the 2d array seems slightly confusing to myself and I
dont possess any of the original materials. Unfortunately this is incomplete.
 */
import java.util.*;
public class Array2D {
    public static void topRun(){
        System.out.println("Top runner: Jose Altimore. Runner time: 243");
    }
    public static void runnerData(String chooseName){
        int[][] runnerArray = new int [20][3]; //2D ARRAY
        String [] []  runnerLastName = new String [20][2];
        String [] []  runnerFirstName = new String [20][2];
        int rowArrayRun =20;
        int columnArrayRun = 3;
        int columnArrayName=2;
        int findName = 0;
        //  COLUMN 0				COLUMN 1				COLUMN 2			COLUMN 3							COLUMN 4
        runnerArray[0][0] = 1; runnerArray[0][1] = 341; runnerArray[0][2] = 1;	runnerLastName[0][0] = "Parson";	runnerFirstName[0][0] = "Scott";
        runnerArray[1][0] = 2; runnerArray[1][1] = 273; runnerArray[1][2] = 2;	runnerLastName[1][0] = "Elor";		runnerFirstName[1][0] = "Kara";
        runnerArray[2][0] = 3; runnerArray[2][1] = 278; runnerArray[2][2] = 5;	runnerLastName[2][0] = "Griffin";	runnerFirstName[2][0] = "Blake";
        runnerArray[3][0] = 4; runnerArray[3][1] = 329; runnerArray[3][2] = 7;	runnerLastName[3][0] = "Small";		runnerFirstName[3][0] = "Samantha";
        runnerArray[4][0] = 5; runnerArray[4][1] = 445; runnerArray[4][2] = 9;	runnerLastName[4][0] = "George";	runnerFirstName[4][0] = "Paul";
        runnerArray[5][0] = 6; runnerArray[5][1] = 275; runnerArray[5][2] = 3;	runnerLastName[5][0]= "Wax";		runnerFirstName[5][0] = "Mike";
        runnerArray[6][0] = 7; runnerArray[6][1] = 275; runnerArray[6][2] = 4;	runnerLastName[6][0] = "Pozzoto";	runnerFirstName[6][0] = "Sue";
        runnerArray[7][0] = 8; runnerArray[7][1] = 243; runnerArray[7][2] = 1;	runnerLastName[7][0] = "Altimore";	runnerFirstName[7][0] = "Jose";
        runnerArray[8][0] = 9; runnerArray[8][1] = 344; runnerArray[8][2] = 1;	runnerLastName[8][0] = "Garshi";	runnerFirstName[8][0] = "Nera";
        runnerArray[9][0] = 10; runnerArray[9][1] = 412; runnerArray[9][2] = 1;	runnerLastName[9][0] = "Ostin";		runnerFirstName[9][0] = "Jane";
        runnerArray[10][0] = 11; runnerArray[10][1] = 393; runnerArray[10][2] = 4;	runnerLastName[10][0] = "Cary";		runnerFirstName[10][0] = "Emma";
        runnerArray[11][0] = 12; runnerArray[11][1] = 299; runnerArray[11][2] = 4;	runnerLastName[11][0] = "Ham";		runnerFirstName[11][0] = "Dave";
        runnerArray[12][0] = 13; runnerArray[12][1] = 343; runnerArray[12][2] = 3;	runnerLastName[12][0] = "Bazdar";	runnerFirstName[12][0] = "Neda";
        runnerArray[13][0] = 14; runnerArray[13][1] = 317; runnerArray[13][2] = 6;	runnerLastName[13][0] = "Smith";	runnerFirstName[13][0]= "Asher";
        runnerArray[14][0] = 15; runnerArray[14][1] = 265; runnerArray[14][2] = 8;	runnerLastName[14][0] = "Henor";	runnerFirstName[14][0] = "Kaleb";
        runnerArray[15][0] = 16; runnerArray[15][1] = 288; runnerArray[15][2] = 7;	runnerLastName[15][0] = "Big";		runnerFirstName[15][0] = "Jeff";
        runnerArray[16][0] = 17; runnerArray[16][1] = 249; runnerArray[16][2] = 3;	runnerLastName[16][0] = "Duff";		runnerFirstName[16][0] = "Kingsley";
        runnerArray[17][0] = 18; runnerArray[17][1] = 350; runnerArray[17][2] = 3;	runnerLastName[17][0] = "Wright";	runnerFirstName[17][0] = "Bob";
        runnerArray[18][0] = 19; runnerArray[18][1] = 280; runnerArray[18][2] = 5;	runnerLastName[18][0] = "McCall";	runnerFirstName[18][0] = "Jennifer";
        runnerArray[19][0] = 20; runnerArray[19][1] = 262; runnerArray[19][2] = 7;	runnerLastName[19][0] = "Smooth";	runnerFirstName[19][0] = "Jimmy";

        for (int i=0;i<rowArrayRun;i++){
            if (chooseName.matches(runnerFirstName[i][0])){
                System.out.println(runnerFirstName[i][0] + " " + runnerLastName[i][0]);
            }
        }
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String chooseName;
        Scanner userInput = new Scanner(System.in);
        int choice;

        System.out.println("Enter 1. to view a runner's stats. Enter 2. to view the top speed");

        choice = userInput.nextInt();

        if (choice ==1){
            System.out.println("Enter a name to view stats");
            chooseName = userInput.next();
            runnerData(chooseName);
        }else{
            topRun();
        }
    }
}
