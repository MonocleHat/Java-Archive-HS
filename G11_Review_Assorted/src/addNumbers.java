import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;
public class addNumbers {
    public static void main(String[] args) throws IOException {
        File numbersFile = new File ("C:\\Users\\path\\to\\file of\\numbers.txt");
        if (numbersFile.exists()){ //Checks if the file is there
            System.out.println(numbersFile.getName() +"Exists!");//Outputs that the file is there and that it exists. (Getname is to get the name of the file)

        }else{
            System.out.println("This doesnt exist");//Tells the user that the file could not be found in the specified directory.
            try{
                PrintWriter output = new PrintWriter(numbersFile);

            }catch(FileNotFoundException e){
                System.out.println("System error: Check Java Code");
            }
        }
        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader(numbersFile)));

            while (s.hasNext()) {
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }

    }
}
