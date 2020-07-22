//Project was assigned on 2016-11-29
/*
* Project was meant to introduce concepts of OOP to students in the grade 11 class. It was an excellent intro to the
* subject and the project was completed with minimal difficulties.
* There were additional projects found on my drives that indicate that there may have been other iterations of the same
* assignment, however, these files were unrecoverable or in their "blank"/default state and incomplete.
* The same instructions present in those are present here.
*
* @author Brandyn "MonocleHat"
*
* */




import java.util.*;
public class BagTester {

    public static void main(String[] args) {
        Scanner uPrompt = new Scanner(System.in);
        Scanner pgPrompt = new Scanner(System.in);
        Scanner selPrompt = new Scanner(System.in);

        int x = 0;

        int pg1 = 0;
        int pg2 = 0;
        int pg3 = 0;
        int pg4 = 0;

        String lbl1;
        String lbl2;
        String lbl3;
        String lbl4;

        String col1;
        String col2;
        String col3;
        String col4;

        /*
         * a. Prompt user for information of two school bags and their content
         */
        System.out.print("Label the first binder: ");
        lbl1 = uPrompt.next();
        System.out.println();
        uPrompt.nextLine();

        System.out.print("Choose a color for the binder: ");
        col1 = uPrompt.next();
        System.out.println();
        uPrompt.nextLine();

        System.out.print("Label the second binder: ");
        lbl2 = uPrompt.next();
        System.out.println();
        uPrompt.nextLine();

        System.out.print("Choose a color for the binder: ");
        col2 = uPrompt.next();
        System.out.println();
        uPrompt.nextLine();

        System.out.print("How many pages should the first binder have: ");
        pg1 = pgPrompt.nextInt();
        System.out.println();

        System.out.print("How many pages should the second binder have: ");
        pg2 = pgPrompt.nextInt();
        System.out.println();

        //BREAK HERE

        System.out.print("Label the third binder: ");
        lbl3 = uPrompt.next();
        System.out.println();
        uPrompt.nextLine();

        System.out.print("Choose a color for the binder: ");
        col3 = uPrompt.next();
        System.out.println();
        uPrompt.nextLine();

        System.out.print("Label the fourth binder: ");
        lbl4 = uPrompt.next();
        System.out.println();
        uPrompt.nextLine();

        System.out.print("Choose a color for the binder: ");
        col4 = uPrompt.next();
        System.out.println();
        uPrompt.nextLine();

        System.out.print("How many pages should the third binder have: ");
        pg3 = pgPrompt.nextInt();
        System.out.println();

        System.out.print("How many pages should the fourth binder have: ");
        pg4 = pgPrompt.nextInt();
        System.out.println();

        Binder b1 = new Binder(lbl1,col1,pg1);
        Binder b2 = new Binder(lbl2,col2,pg2);
        Binder b3 = new Binder(lbl3,col3,pg3);
        Binder b4 = new Binder(lbl4,col4,pg4);
        /* b. Create two instances of school bag.
         * Use different constructors to create each instance
         */
        SchoolBag s1 = new SchoolBag(b1,b2);
        SchoolBag s2 = new SchoolBag(b3,b4);

        /* c. Continue to prompt user for the following until  -1 is entered for ID
         *
         * i. 	ID for a schoolbag
         * ii. 	ID for a binder in the schoolbag
         * iii.	Add or remove sheets
         * iv.	The number of sheets
         */
        //selection prompt, ints only selPrompt
        int bindID = 0;
        int choice = 0;
        int pgAmt = 0;
        while (x != -1){
            System.out.println("Enter an ID for a schoolbag");
            x = selPrompt.nextInt();
            if (x == 1){
                System.out.println("Schoolbag 1 selected, 2 binders present");
                System.out.println("Select a binder");
                bindID = selPrompt.nextInt();
                if (bindID == 1){
                    System.out.println("To add sheets, press 1, to remove sheets press 2");
                    choice = selPrompt.nextInt();
                    if (choice == 1){
                        System.out.println("enter pages to add");
                        pgAmt = selPrompt.nextInt();
                        b1.addSheets(pgAmt);
                    }
                    else if (choice == 2){
                        System.out.println("Enter pages to subtract");
                        pgAmt = selPrompt.nextInt();
                        b1.subSheets(pgAmt);
                    }else{
                        System.out.println ("not a valid command");
                    }
                    System.out.println(b1.getBindSheetNum());
                }
                else if (bindID == 2){
                    System.out.println("To add sheets, press 1, to remove sheets press 2");
                    choice = selPrompt.nextInt();
                    if (choice == 1){
                        System.out.println("enter pages to add");
                        pgAmt = selPrompt.nextInt();
                        b1.addSheets(pgAmt);
                    }
                    else if (choice == 2){
                        System.out.println("Enter pages to subtract");
                        pgAmt = selPrompt.nextInt();
                        b1.subSheets(pgAmt);
                    }else{
                        System.out.println ("not a valid command");
                    }
                    System.out.println(b2.getBindSheetNum());
                }
            }
            else if (x == 2){
                System.out.println("Schoolbag 2 selected, Binders 3 and 4 present");
                System.out.println("Select a binder");
                bindID = selPrompt.nextInt();
                if (bindID == 3){
                    System.out.println("To add sheets, press 1, to remove sheets press 2");
                    choice = selPrompt.nextInt();
                    if (choice == 1){
                        System.out.println("enter pages to add");
                        pgAmt = selPrompt.nextInt();
                        b3.addSheets(pgAmt);
                    }
                    else if (choice == 2){
                        System.out.println("Enter pages to subtract");
                        pgAmt = selPrompt.nextInt();
                        b3.subSheets(pgAmt);
                    }else{
                        System.out.println ("not a valid command");
                    }
                    System.out.println(b3.getBindSheetNum());
                }
                else if (bindID == 4){
                    System.out.println("To add sheets, press 1, to remove sheets press 2");
                    choice = selPrompt.nextInt();
                    if (choice == 1){
                        System.out.println("enter pages to add");
                        pgAmt = selPrompt.nextInt();
                        b4.addSheets(pgAmt);
                    }
                    else if (choice == 2){
                        System.out.println("Enter pages to subtract");
                        pgAmt = selPrompt.nextInt();
                        b4.subSheets(pgAmt);
                    }else{
                        System.out.println ("not a valid command");
                    }
                    System.out.println(b4.getBindSheetNum());
                }
            }
        }




        /* d. Print out the information of each schoolbag
         */
        System.out.println("Schoolbag 1");
        System.out.println(b1.toString());
        System.out.println(b2.toString());

        System.out.println("Schoolbag 2");
        System.out.println(b3.toString());
        System.out.println(b4.toString());

    }

}
