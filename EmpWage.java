import java.lang.Math;

//Constants
public class EmpWage {
    public static final int PARTTIME = 1;
    public static final int FULLTIME = 2;
    public static final int EMPRATEPERHOUR = 20;
    public static final int WORKINGDAYS = 20;
    public static final int HRSINMONTH = 100;
    public static void main (String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem");

        //Variables
        int totalEmpWage = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        //Computation
        while (totalEmpHrs <= HRSINMONTH &&
               totalWorkingDays < WORKINGDAYS) {
            int empHrs = 0;
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case FULLTIME :
                    empHrs = 8;
                    break;
                case PARTTIME :
                    empHrs = 4;
                    break;
                default :
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            int empWage = empHrs * EMPRATEPERHOUR;
            totalEmpWage += empWage;
            System.out.println("Employee Wage is : " +empWage);
        }
        System.out.println("Total Employee Wage is : " +totalEmpWage);
        System.out.println("Total Working Days : " + totalWorkingDays + 
           " TotalEmployee Hours : " + totalEmpHrs);
    }
}