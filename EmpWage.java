import java.lang.Math;

//Constants
public class EmpWage {
    public static final int PARTTIME = 1;
    public static final int FULLTIME = 2;

    public static int multiCompanyEmpWage(String company, int empRatePerHour, int numberOfWorkingDays, 
                                            int hrsPerMonth) {
        
        //Variables
        int empHrs = 0, totalEmpWage = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        //Computation
        while (totalEmpHrs <= hrsPerMonth &&
               totalWorkingDays < numberOfWorkingDays) {
            totalWorkingDays++;
            int checkEmp = (int) Math.floor(Math.random() * 10) % 3;
            switch (checkEmp) {
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
        totalEmpWage = totalEmpHrs + empRatePerHour;
        System.out.println("Total Employee Wage for " +company+ " Company is : " +totalEmpWage);
        return totalEmpWage;
    }
    public static void main (String[] args) {
        multiCompanyEmpWage("TCS", 20, 1, 10);
        multiCompanyEmpWage("Infosys", 10, 2, 20);
        multiCompanyEmpWage("Wipro", 10, 3, 20);
        multiCompanyEmpWage("Magic edTech", 20, 4, 10);

    }
}