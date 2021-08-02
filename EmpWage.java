public class EmpWage {

    // Constants
    public static final int partTime = 1;
    public static final int fullTime = 2;
    public final String company;
    public final int empRatePerHour;
    public final int numberOfWorkingDays;
    public final int hrsPerMonth;
    public int totalEmpWage;    
    
    public EmpWage(String company, int empRatePerHour, int numberOfWorkingDays, 
                                            int hrsPerMonth) {
        
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.hrsPerMonth = hrsPerMonth;

    }

    public void setTotalEmpWage(int totalEmpWage) {
			 
        this.totalEmpWage = totalEmpWage;
        
    }
    
    @Override
    public String toString() {
        return " Total Emp Wage for " + company + " is " + totalEmpWage ;
    }
}