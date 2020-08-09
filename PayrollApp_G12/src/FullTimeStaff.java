//Author: Brandyn "MonocleHat"
//Original date: 2017/02/01
public class FullTimeStaff extends Employee{
    private int yearlySickDay;
    private double yearlySalary;
    private int sickDaysLeft;

    public FullTimeStaff(String fName, String lName, int empNum, int yearlySickDay, double yearlySalary, int sickDaysLeft){
        super (fName, lName, empNum);
        this.yearlySickDay = yearlySickDay;
        this.yearlySalary = yearlySalary;
        this.sickDaysLeft = sickDaysLeft;
    }


    public double pay() {
        // TODO Auto-generated method stub
        double salMonth = 0;
        salMonth = this.yearlySalary / 12;
        return salMonth;
    }
    public int sickDaysUsed(){
        return yearlySickDay - sickDaysLeft;
    }
    public int compareToSickDay(Employee other){
        if (other instanceof FullTimeStaff){
            return this.sickDaysUsed() - ((FullTimeStaff) other).sickDaysUsed();
        }else {//instanceOf PartTimeStaff
            return this.sickDaysUsed() - ((PartTimeStaff)other).getSickDaysTaken();
        }
    }

    public void deductSickDay() {
        // TODO Auto-generated method stub
        sickDaysLeft--;
    }

    public void resetSickDay() {
        // TODO Auto-generated method stub
        this.sickDaysLeft = this.yearlySickDay;
    }

    public String printPayStub() {
        // TODO Auto-generated method stub
        String s = new String();
        s = "Sick Days Remaining: " +this.sickDaysLeft +"Amt earned: " +this.pay();
        return s;
    }
    public String toString(){
        String s = new String();
        s = "Full Time Staff " +"\n";
        s += super.toString();
        return s;
    }


    public double getYearlySalary() {
        // TODO Auto-generated method stub
        return yearlySalary;
    }

}
