import java.lang.Math;

public class EmpWage {
    public static final int PARTTIME = 1;
    public static final int FULLTIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numberOfWorkingDays;
    private final int hrsPerMonth;
    private int totalEmpWage;
    private int empDailyWage;    
    
    public EmpWage(String company, int empRatePerHour, int numberOfWorkingDays, 
                                            int hrsPerMonth) {
        
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.hrsPerMonth = hrsPerMonth;

    }

    public void empWageComputation() {
        
        //Variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

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
            empDailyWage = empHrs * empRatePerHour;
		    System.out.println("Employee's Daily Wage : " +empDailyWage);
            System.out.println("Employee Working Days : " +totalWorkingDays + 
                                "Employee Working Hours : " +totalEmpHrs);
        }
        totalEmpWage = totalEmpHrs + empRatePerHour;

    }

    @Override
    public String toString() {
        return "Total Employee Wage for " +company+ " Company is : " +totalEmpWage;
    }
    public static void main (String[] args) {
        EmpWage TCS = new EmpWage("TCS", 20, 1, 10);
        EmpWage Infosys = new EmpWage("Infosys", 10, 2, 20);
        EmpWage Wipro = new EmpWage("Wipro", 10, 3, 20);
        EmpWage Magic = new EmpWage("Magic edTech", 20, 4, 10);
        TCS.empWageComputation();
        System.out.println(TCS);
        Infosys.empWageComputation();
        System.out.println(Infosys);
        Wipro.empWageComputation();
        System.out.println(Wipro);
        Magic.empWageComputation();
        System.out.println(Magic);
    }
}