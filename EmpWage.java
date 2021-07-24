import javax.lang.model.util.ElementScanner14;

//Constants
public class EmpWage {
    public static final int Part_Time = 1;
    public static final int Full_Time = 2;
    public static final int Emp_Rate_Per_Hour = 20;
    public static final int Working_Days = 20;
    public static final int Hrs_In_Month = 100;
    public static void main (String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem");

        //Variables
        int totalEmpWage = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        //Computation
        while (totalEmpHrs <= Hrs_In_Month &&
               totalWorkingDays < Working_Days) {
            int empHrs = 0;
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case Full_Time :
                    empHrs = 8;
                    break;
                case Part_Time :
                    empHrs = 4;
                    break;
                default :
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            int empWage = empHrs * Emp_Rate_Per_Hour;
            totalEmpWage += empWage;
            System.out.println("Employee Wage is : " +empWage);
        }
        System.out.println("Total Employee Wage is : " +totalEmpWage);
        System.out.println("Total Working Days : " + totalWorkingDays + 
            " TotalEmployee Hours : " + totalEmpHrs);
    }
}