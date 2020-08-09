//Author: Brandyn "MonocleHat"
//Original Date: 2016/02/29
public class HalfDiamond {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int j = 1; j<=4; j++){
            for (int i = 1; i<=j; i++){

                System.out.print("$");
            }
            System.out.print("\n");

        }
        for (int j = 1; j<=5; j++){
            for (int i = j; i<=5; i++){

                System.out.print("$");

            }

            System.out.print("\n");

        }
    }
}
