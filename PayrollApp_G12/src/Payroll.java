import java.util.*;
//Author: Brandyn "MonocleHat"
//Original Date: 2017/02/01
public class Payroll {
    ArrayList staffList = new ArrayList();
    /**
     * listAllEmployee - lists all employee
     * (employee number, name)
     */
    public void listAllEmployee(){
        if (staffList!=null){
            int s = staffList.size();

            for (int i =0; i<s; i++){
                System.out.println(staffList.get(i));
            }
        }else{
            System.out.println("No staff to output");


        }
    }
    /**
     * averageSalary - calculates and returns average salary
     * of all full time staffs
     * @return
     */
    public double averageSalary(){
        //keep track of sum of full time salaries
        // number of fullTimeStaff is n
        double sum = 0, n = 0;
        int s = staffList.size();
        for (int i = 0; i<s; i++){
            Employee e = (Employee) staffList.get(i);
            if (e instanceof FullTimeStaff){
                sum += ((FullTimeStaff)e).getYearlySalary();
                n++;
            }
        }
        return sum;
    }
}
