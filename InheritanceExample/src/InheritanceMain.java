public class InheritanceMain {
    public static void main (String[]args){
        Student s = new Student("Ethan");
        String n = s.getName();
        System.out.println(n);

        //Person p = new Person("Maria");
        //person cant see Student stuff
        //int number = ((Student)p).getNumber();
        Person p = new Student ("Maria");
        int number = ((Student) p).getNumber();
        System.out.println(number);
        Student m = new Student("Adam",17,1234);
        System.out.println (m.getName());
    }
}
