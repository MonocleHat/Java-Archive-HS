import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class StarTable {
    public static void main(String[] args)  {

        int rows;
        int col;
        Scanner uInput = new Scanner (System.in);
        System.out.println("enter the amount of rows");
        rows = uInput.nextInt();
        System.out.println("Enter the amount of columns");
        col = uInput.nextInt();
        char [][]sTable = new char [rows][col];

        for (int i = 0;i<sTable.length;i++){
            for (int y = 0;y<sTable[i].length;y++){
                sTable[i][y] = '*';
            }
        }
        //testing if initialized
		/*for (int i = 0;i<sTable.length;i++){
			for (int y = 0;y<sTable[i].length;y++){
				System.out.print(sTable[i][y]);
			}
			System.out.println();
		}
		 */
        //C:\\Users\\owner pc\\Desktop\\inputoutput files\\
        File starTableFile = new File("\"C:\\Users\\path\\to\\file of\\startable.txt"); //This denotes where a file is on your computer
        if (starTableFile.exists()){ //Checks if the file is there
            System.out.println(starTableFile.getName() +"Exists!");//Outputs that the file is there and that it exists. (Getname is to get the name of the file)
            System.out.println("Stand by for output");
        }else{
            System.out.println("This doesnt exist");//Tells the user that the file could not be found in the specified directory.
        }
        //Write to file
        try{
            PrintWriter output = new PrintWriter (starTableFile);
            for (int i = 0;i<sTable.length;i++){
                for (int y = 0;y<sTable[i].length;y++){
                    output.print(sTable[i][y]);
                }
                output.println();
            }
            output.close();

        }catch(IOException ex){
            System.out.println("UNEXPECTED ERROR TRY AGAIN");
        }

        try{
            Scanner input = new Scanner (starTableFile);
            for (int i = 0; i<rows;i++){
                String name = input.nextLine();
                System.out.println(name);
            }


        }catch(FileNotFoundException e){
            System.out.println("Error: ");
        }

    }
}
