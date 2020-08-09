public class Student extends Person{
    public Student(String name){
        super(name);
    }
    public Student (String n, int a, int sn){
        super(n,a);
        this.stuNum = sn;
    }
    private int stuNum;

    public int getNumber() {
        return stuNum;
    }

    public void setNumber(int stuNum) {
        this.stuNum = stuNum;
    }
}
