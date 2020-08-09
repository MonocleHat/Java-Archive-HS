import java.util.Scanner;
public class GradeConverter {
    public static char grades(int gradeConvert){
        char mark;
        if (gradeConvert <= 100 && gradeConvert >= 80){
            mark = 'A';
        }
        else if (gradeConvert >= 70  && gradeConvert <= 79){
            mark = 'B';
        }
        else if (gradeConvert >= 60  && gradeConvert <= 69){
            mark = 'C';
        }
        else if (gradeConvert >= 50  && gradeConvert <= 59){
            mark = 'D';
        }
        else if (gradeConvert ==-1){
            mark = ' ';
        }
        else {
            mark = 'F';
        }
        //System.out.println("char in method: " +mark);
        return mark;

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int gradeConvert;
        char mark;
        Scanner userInput = new Scanner (System.in);
        do{
            System.out.print("Enter a numeric grade (or -1 to quit): ");
            gradeConvert = userInput.nextInt();
            if(gradeConvert > 0){
                grades(gradeConvert);

            }
            //System.out.println ("Displaying before conversion");
            mark = grades(gradeConvert);
            if (mark != ' '){
                System.out.println("Your mark is: " + mark);
            }
            else{

            }
        }while (gradeConvert !=-1);
    }
}
