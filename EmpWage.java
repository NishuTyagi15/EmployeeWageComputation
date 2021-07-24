import javax.lang.model.util.ElementScanner14;

//Constants
public class EmpWage {
    public static final int Part_Time = 1;
    public static final int Full_Time = 2;
    public static final int Emp_Rate_Per_Hour = 20;
    public static final int Working_Days = 20;
    public static void main (String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem");

        //Variables
        int empHrs = 0; int empWage = 0; int totalEmpWage = 0;

        //Computation
        for (int d = 0; d < Working_Days; d++) {
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
            empWage = empHrs * Emp_Rate_Per_Hour;
            totalEmpWage += empWage;
            System.out.println("Employee Wage is : " +empWage);
        }
        System.out.println("Total Employee Wage is : " +totalEmpWage);
    }
}