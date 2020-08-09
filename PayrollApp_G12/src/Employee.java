//Author: Brandyn "MonocleHat"
//Original date: 2017/02/01
public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected int empNumber;

    public Employee(String firstName, String lastName, int empNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.empNumber = empNumber;
    }
    public abstract double pay();

    public abstract void deductSickDay();

    public abstract void resetSickDay();

    public abstract String printPayStub();

    public String toString(){
        String s = new String();
        s = "First name: " +firstName +"/n" +"last Name: " +lastName +"/n" +"employee number: " +empNumber;
        return s;

    }
}
