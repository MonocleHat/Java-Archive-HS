import java.util.*;
public class Identity {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner userInput = new Scanner (System.in);

        String EmpID;
        System.out.println("Enter an employee ID: ");
        EmpID = userInput.nextLine();
        DataScan(EmpID);
    }
    public static void DataScan (String EmpID){
        String[]Identity = {"005588","082614","002971","002314","002316","005478"};
        String [] Names = {"Sterling Archer", "Cyril Figgis", "Pam Poovey","Lana Kane","Mallory Archer","Cheryl Tunt"};
        int noEmployees;
        int findID = 0;
        String findName = " ";
        noEmployees = Identity.length;
        for (int i = 0;i<noEmployees;i++){
            if (Identity[i].equals(EmpID)){
                findID = 1;
                findName = Names[i];
            }

        }
        if(findID ==1){
            System.out.println("Employee No. " +EmpID +" has been identified as: " +findName);
        }else{
            System.out.println("An error has occured");
            System.out.println("This employee could not be found, was terminated, or the number was entered incorrectly");
            System.out.println("Please try again");
        }
    }
}
