import java.lang.Math;

public class Random {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double numOne = Math.random() * 100 + 1;
        double numTwo = Math.random() * 100 + 1;
        double numThree = Math.random() * 100 + 1;
        double numFour = Math.random() * 100 + 1;
        double numFive = Math.random() * 100 + 1;

        System.out.println("Numbers generated: ");
        System.out.println("Num One: " +numOne);
        System.out.println("Num Two: " +numTwo);
        System.out.println("Num Three: " +numThree);
        System.out.println("Num Four: " +numFour);
        System.out.println("Num Five: " +numFive);

        double maxOne = Math.max(numOne, numTwo);
        double maxTwo = Math.max(maxOne, numThree);
        double maxThree = Math.max(maxTwo, numFour);
        double maxFour = Math.max(maxThree, numFive);

        //min
        double minOne = Math.min(numOne, numTwo);
        double minTwo = Math.min(minOne, numThree);
        double minThree = Math.min(minTwo, numFour);
        double minFour = Math.min(minThree, numFive);
        System.out.println("Min: " +minFour);
        System.out.println("Max: " +maxFour);

    }
}
