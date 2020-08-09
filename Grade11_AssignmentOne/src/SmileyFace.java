public class SmileyFace {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.format ("%20s%n","*****"); //Top of the head
        System.out.format ("%15s %5s%n","*","*");
        System.out.format ("%14s %1.9s %3s %1s%n","*","_","_","*");
        System.out.format ("%13s %2s %3s %2s%n","*","o","o","*");//Eyes
        System.out.format ("%12s %5s %5s%n","*","|","*");
        System.out.format ("%12s %5s %5s%n","*","+","*");//Nose
        System.out.format ("%13s %1s %1s%n","*","\\_____/","*" );//Smiling mouth, required two slashes to work
        System.out.format ("%14s %7s%n","*","*");
        System.out.format ("%15s %5s%n","*","*");
        System.out.format ("%20s%n","*****");//bottom of mouth
    }
}
