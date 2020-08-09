import java.util.*;
public class Arrays_4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int testNum; //Columns
        int studentNum; //Rows
        Scanner uPrompt = new Scanner(System.in);
        System.out.println("how many students are there?");
        studentNum = uPrompt.nextInt(); //get student value
        System.out.println("how many tests?");
        testNum = uPrompt.nextInt(); //get amount of tests
        int marks[][] = new int [studentNum][testNum]; //set array values
        int studentCounter = 1; //counter

        for (int i = 0; i<marks.length; i++){
            System.out.println("Enter the marks for student: "
                    +studentCounter); //tell user to enter the marks for a specific student (1,2,3)
            for (int j = 0; j < marks[i].length; j++){
                marks[i][j] = uPrompt.nextInt(); //Enter the marks for the user
            }
            studentCounter++;//increase student counter
        }
        studentCounter = 1;
        for (int i = 0; i<marks.length; i++){

            for (int j = 0; j < marks[i].length; j++){
                System.out.print(marks[i][j] +" ");
            }
            System.out.println();
        }
        int avgContainer = 0;
        int[]averageArray = new int [studentNum];
        for (int i = 0; i<marks.length; i++){
            for (int j = 0; j < marks[i].length; j++){
                avgContainer = avgContainer + marks[i][j];
            }
            avgContainer = avgContainer / testNum;
            averageArray[i] = avgContainer;
            avgContainer = 0;
            System.out.println("Student " +studentCounter +" Average is: " +averageArray[i]);
            studentCounter++;
        }
        int studentTracker = 0;
        int greaterAvg = 0;
        for (int i = 0; i< averageArray.length;i++){
            if (averageArray[i] > greaterAvg){
                greaterAvg = averageArray[i];
                studentTracker = i+1;
            }
        }
        int totalAvgCount = averageArray.length-1;
        System.out.println("The student with the greatest average in the class is student: " +studentTracker);
        int avgClass = 0;
        for (int i = 0; i < averageArray.length;i++){
            avgClass = averageArray[i] + avgClass;

        }
        avgClass = avgClass / totalAvgCount;
        System.out.println("The class average is: " +avgClass);
        for (int i = 0; i< averageArray.length;i++){
            if (averageArray[i] > avgClass){
                System.out.println("Student: " +studentTracker +" has an average mark over the class average.");
            }

        }
        uPrompt.close();
    }
}
