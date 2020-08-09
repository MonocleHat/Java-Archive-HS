import java.lang.Math;
public class PowersTable {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int loopCount = 1; //Loop counter and used to calculate powers of each value.
        System.out.format ("%10s %10s %10s %10s %10s%n", "X^1","X^2","X^3","X^4","x^5"); //Displays the top of the chart
        while (loopCount < 6){ //While loop begins, stops when loopCount is equal to or higher than six.
            System.out.printf("%10d %10d %10d %10d %10d%n", (int) Math.pow(loopCount, 1), (int)Math.pow(loopCount, 2),(int)Math.pow(loopCount, 3),(int)Math.pow(loopCount, 4),(int)Math.pow(loopCount, 5));//Displays the values in the chart
            loopCount++; //Increments by 1
        }
    }
}
