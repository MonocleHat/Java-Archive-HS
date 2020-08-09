import java.util.Scanner;

public class Arrays_Roster {
    public static void main(String[] args) {

        Scanner userPrompt = new Scanner (System.in);
        int rostSize;
        String[] studentName;
        String studentFirst;

        System.out.print("Enter the amount of students: ");
        rostSize = userPrompt.nextInt();
        studentName = new String[rostSize];

        for (int i = 0; i < rostSize; i++){
            System.out.println("Enter name");
            studentFirst = userPrompt.next();
            studentName[i] = studentFirst;
        }
        System.out.println("Student Roster:");
        System.out.println();
        rostSize = rostSize - 1;
        for (int i = rostSize; i >= 0; i--) {
            System.out.println(studentName[i]);

        }
        userPrompt.close();

    }

}
