/*
the following programs were part of the first assignment we received in our java classes during grade 11
most of these were very simple usage of the System.out series of commands, and dont really provide anything of substance

Original: 2015-09-28
Author: Brandyn "MonocleHat"
 */
public class BingoCard {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //in order to have the text separated onto another line, I used the text "%n".
        System.out.format ("%1s %4s %4s %4s %4s%n","B","I","N","G","O"); //Will display the words BINGO
        System.out.format ("%1s %4s %4s %4s %4s%n","2","20","42","60","64"); //will display the a line of numbers
        System.out.format ("%1s %3s %4s %4s %4s%n","14","25","32","55","70");
        System.out.format ("%1s %4s %5s %3s %4.5s%n","5","18","FREE","53","67");
        System.out.format ("%1s %3s %4s %4s %4.5s%n","12","16","31","46","75");
        System.out.format ("%1s %3s %4s %4s %4.5s%n","10","22","39","59","71");
        System.out.format ("%1s %5s%n","1."," The caller randomly pulls a numbered bingo ball.");
        System.out.format ("%1s %5s%n","2."," The number is placed on the bingo board and called out.");
        System.out.format ("%1s %5s%n","3."," Players look for the called number on their bingo card.");
        System.out.format ("%1s %5s%n","4."," If the number is located, it is marked off.");
        System.out.format ("%1s %5s%n","5."," Steps 1 to 4 are repeated until a player matches the BINGO pattern");
        System.out.format ("%1s %5s%n","6."," The winning player yells BINGO");
    }
}
