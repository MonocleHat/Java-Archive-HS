//Author: Brandyn "MonocleHat"
//Original Date - 2015-11-24
public class Typewriter {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * Below code allows for text to be displayed
         * letter by letter similar to the typing
         * of a typewriter. an effect achieved through
         * the use of a for loop, and the code necessary to delay a program.
         */
        int loopStop = 3;
        String[]text = {"T","E","S","T"};
        for(int loopCount = 0; loopCount <= loopStop;loopCount++ ){
            System.out.print(text[loopCount]);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                //TODO Auto-generated catch block
                e.printStackTrace();

            }
            System.out.print("");

        }
    }

}
