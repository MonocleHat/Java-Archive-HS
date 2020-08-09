import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
public class WritingToFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("data.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(file));
        pw.println("The fitness gram pacer test is a multistage");
        pw.println("Aerobic capacity test that progressively gets");
        pw.println("more difficult as it continues.");
        pw.println("The 20 meter pacer test will begin in 30 seconds.");
        pw.println("Line up at the start. the running speed starts slowly");
        pw.println("But gets faster each minute you hear this sound.");
        pw.println("A single lap should be completed each time you hear this sound.");
        pw.println("Remember to run in a straight line and run as long as possible");
        pw.println("The second time you fail to complete a lap before the sound, your test is over");
        pw.println("The test will begin on the word start. On your mark, get ready, start.");
        pw.close();
    }
}
