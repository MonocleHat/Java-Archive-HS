import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNext()){
            int num = sc.nextInt();
            String name = sc.next();
            //System.out.println(num);
            System.out.printf("%-10s %-4d\n",name, num);
        }

    }
}
