import java.math.*;
//Author: Brandyn "MonocleHat"
//Original Date: 2017/02/01
public class PartTimeStaff extends Employee{
    private double numHoursAssigned;
    private double hourlyRate;
    private int sickDaysTaken;

    public PartTimeStaff(String fName, String lName, int empNum, double numHoursAssigned, double hourlyRate, int sickDaysTaken){
        super(fName, lName, empNum);
        this.numHoursAssigned = numHoursAssigned;
        this.hourlyRate = hourlyRate;
        this.sickDaysTaken = sickDaysTaken;
    }

    public double pay (){
        double earned;
        double deduct;
        earned = this.hourlyRate * this.numHoursAssigned;
        deduct = this.numHoursAssigned * this.sickDaysTaken;
        deduct = this.hourlyRate * deduct;
        earned = earned - deduct;
        return earned;

    }
    public void deductSickDay(){
        sickDaysTaken++;
    }
    public int getSickDaysTaken(){
        return sickDaysTaken;
    }
    public void resetSickDay(){
        this.sickDaysTaken = 0;
    }

    public int compareToSickday (PartTimeStaff c){
        return this.sickDaysTaken - c.sickDaysTaken;
    }

    public String printPayStub() {
        String s = new String();
        s = "Hours assigned: " +this.numHoursAssigned +"Amt earned: " +this.pay();
        return s;
    }
    public String toString(){
        String s = new String();
        s = "Part Time Staff " +"\n";
        s += super.toString();
        return s;
    }

}
