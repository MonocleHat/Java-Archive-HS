import java.util.ArrayList;
//Author: MonocleHat
//Original Date:2017-02-22
public class Checker {
    public static void main (String[]args){
        ArrayList<Student> rayList = new ArrayList<Student>();

        rayList.add(new Student("Sam",17));
        rayList.add(new Student("Sandra",18));
        rayList.add(new Student("Billy",16));
        rayList.add(new Student("Greg",17));
        rayList.add(new Student("Jill",18));

        System.out.println(rayList.get(0));
        System.out.println(rayList.get(1));
        System.out.println(rayList.get(2));
        System.out.println(rayList.size());
        System.out.println(rayList.remove(0));
        System.out.println(rayList);
        System.out.println(rayList.remove(1));
        System.out.println(rayList);
    }
}
