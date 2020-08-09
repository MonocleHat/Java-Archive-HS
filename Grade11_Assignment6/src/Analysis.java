import java.util.*;
public class Analysis {
    public static void drawBar(int width){ //Displays '*' based on the amount given to int width. Value is determined by code in the main method.
        for (int i = 1; i <= width; i++) {//While 'i' is less than Width value, print *

            System.out.print("*");

        }

        System.out.println();

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner userPrompt = new Scanner (System.in);
        int []containArray; //Container array, initial input takes place here
        containArray= new int [1000];//Container array given larger size, will be cut down to fill secondary array, can be modified
        int [] analysisArray; //Real array. Holds the numbers entered in the container array until the last number entered.
        int userNum;
        int conCount=0;//Counts the amount of numbers entered, used to determine the range of the analysisArray.
        int width1=0, width2=0, width3=0,width4=0,width5=0;
        int width6=0,width7=0,width8=0,width9=0,width10=0;

        //Adding to the arrays
        for (int i=0;i<containArray.length;i++){//This for loop gets intergers until a user types -1.
            System.out.println("Enter a num: ");
            userNum = userPrompt.nextInt();
            if (userNum == -1){
                break; //Breaks out of for loop if -1 entered.
            }
            containArray[i]=userNum;//Stores the usernumber at position 'i' in the array.
            conCount++;//Increments by one for every number entered.

        }
        analysisArray = new int [conCount];//Sets the new array to the amount of numbers entered

        for (int j=0; j< analysisArray.length;j++){
            analysisArray[j]=containArray[j];

        }

        //Average Calculations
        int avgContain=0;
        for (int x=0;x<analysisArray.length;x++){ //Goes along the array and adds the numbers at position x on the array to the avgContain variable
            avgContain = avgContain + analysisArray[x];

        }
        avgContain=avgContain/conCount; //Calculates average
        System.out.println("Average: " +avgContain);

        //Max/Min Calculations
        int max=0;
        int min=50;
        for (int y=0;y<analysisArray.length;y++){ //Scans individual numbers one by one
            if (max<analysisArray[y]){ //Sets max int to position Y on the array if max is not yet greater than Y
                max=analysisArray[y];

            }
            if(analysisArray[y]<min){//Sets Min to position Y on the array if Min is not yet lower than Y.
                min=analysisArray[y];

            }

        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);

        //Display Histogram
        for (int c =0;c<analysisArray.length;c++){ //Scans along the array and compares position C in the array to the ranges in the if statements
            //If Number is equal to one of the ranges, that range's "Width" counter is increased by 1.
            //Width is connected to the drawBar method, which will add a * to form a horizontal line for every number entered in a certain range.
            if (analysisArray[c]>=1 && analysisArray[c]<=5){
                width1++;
            }else if (analysisArray[c]>=6 && analysisArray[c]<=10){
                width2++;
            }else if (analysisArray[c]>=11 && analysisArray[c]<=15){
                width3++;
            }else if (analysisArray[c]>=16 && analysisArray[c]<=20){
                width4++;
            }else if (analysisArray[c]>=21 && analysisArray[c]<=25){
                width5++;
            }else if (analysisArray[c]>=26 && analysisArray[c]<=30){
                width6++;
            }else if (analysisArray[c]>=31 && analysisArray[c]<=35){
                width7++;
            }else if (analysisArray[c]>=36 && analysisArray[c]<=40){
                width8++;
            }else if (analysisArray[c]>=41 && analysisArray[c]<=45){
                width9++;
            }else if (analysisArray[c]>=46 && analysisArray[c]<=50){
                width10++;
            }
        }
        //displays output
        System.out.print ("1-5: ");drawBar(width1);
        System.out.print ("6-10: ");drawBar(width2);
        System.out.print ("11-15: ");drawBar(width3);
        System.out.print ("16-20: ");drawBar(width4);
        System.out.print ("21-25: ");drawBar(width5);
        System.out.print ("26-30: ");drawBar(width6);
        System.out.print ("31-35: ");drawBar(width7);
        System.out.print ("36-40: ");drawBar(width8);
        System.out.print ("41-45: ");drawBar(width9);
        System.out.print ("46-50: ");drawBar(width10);
        userPrompt.close();//close input stream
    }
}
