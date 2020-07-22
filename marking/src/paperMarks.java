import java.util.*;

public class paperMarks {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner UI = new Scanner(System.in);
        double pOneMark;
        double pTwoMark;
        double markTotal;
        System.out.print("Hello. ");
        System.out.print("Please enter the marks for paper one. if student was absent, please enter -1 ");
        pOneMark = UI.nextDouble();
        System.out.print("Please enter the marks for paper two. if student was absent, please enter -1 ");
        pTwoMark = UI.nextDouble();

        //marktotals + passing or failing
        if (pOneMark != -1 && pTwoMark != -1){
            markTotal = pOneMark + pTwoMark;
            if(markTotal >= 40){
                System.out.println("Student Passed");
            }else{
                System.out.println("Student Failed");
            }
        }if(pOneMark == -1 && pTwoMark !=-1){
            markTotal = pTwoMark;
            if(markTotal >= 45){
                System.out.println("Student Passed");
            }else{
                System.out.println("Student Failed");
            }
        }if(pOneMark != -1 && pTwoMark ==-1){
            markTotal = pOneMark;
            if(markTotal >= 45){
                System.out.println("Student Passed");
            }else{
                System.out.println("Student Failed");
            }
        }if(pOneMark == -1 && pTwoMark ==-1){
            System.out.println("Student Failed");

        }
    }
}
