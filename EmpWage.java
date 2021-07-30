import java.lang.Math;

//Constants
public class EmpWage {
    public static final int PARTTIME = 1;
    public static final int FULLTIME = 2;
    public static final int EMPRATEPERHOUR = 20;
    public static final int WORKINGDAYS = 20;
    public static final int HRSINMONTH = 100;

    public static int compEmpWage() {
        
        //Variables
        int empHrs = 0, totalEmpWage = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        //Computation
        while (totalEmpHrs <= HRSINMONTH &&
               totalWorkingDays < WORKINGDAYS) {
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
            System.out.println("Employee Working Days : " +totalWorkingDays + 
                                "     Employee Working Hours : " +totalEmpHrs);
        }
        totalEmpWage = totalEmpHrs + EMPRATEPERHOUR;
        System.out.println("Total Employee Wage is : " +totalEmpWage);
        return totalEmpWage;
    }
    public static void main (String[] args) {
        compEmpWage();
    }
}