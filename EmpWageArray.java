import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmpWageArray {

    public static final  int partTime = 1;
    public static final int fullTime = 2;

    private int numOfCompanies=0;
    private ArrayList<EmpWage> empWageList;
    private Map<String, EmpWage> empWageMap;
    
    public EmpWageArray() {
        empWageList = new ArrayList<>();
        empWageMap = new HashMap<>();
    }
 
    private void addEmpWage (String company, int empRatePerHour, int numberOfWorkingDays, int hrsPerMonth) {
	 
	    EmpWage empWage= new EmpWage(company, empRatePerHour, numberOfWorkingDays, hrsPerMonth);
	    empWageList.add(empWage);
        empWageMap.put(company, empWage);
	 
    }

    public void empWageComputation() {
	
	    for(int i=0; i < empWageList.size(); i++) {
            EmpWage empWage = empWageList.get(i);
	        empWage.setTotalEmpWage(this.empWageComputation(empWage));
	        System.out.println(empWage);	
	    }        
    }

    public int getTotalWage(String company) {
        return empWageMap.get(company).totalEmpWage;
    }

    public int empWageComputation(EmpWage empWage) {

        //Variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        //Computation
        while (totalEmpHrs <= empWage.hrsPerMonth &&
                totalWorkingDays < empWage.numberOfWorkingDays) {
            totalWorkingDays++;
            int checkEmp = (int) Math.floor(Math.random() * 10) % 3;
            switch (checkEmp) {
                case fullTime :
                    empHrs = 8;
                    break;
                case partTime :
                    empHrs = 4;
                    break;
                default :
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Employee Working Days : " +totalWorkingDays + 
                        " Employee Working Hours : " +totalEmpHrs);
        }
        
        return totalEmpHrs * empWage.empRatePerHour;
    }

    public static void main (String[] args) {

        EmpWageArray empWageBuilder = new EmpWageArray();
        empWageBuilder.addEmpWage("TCS", 20, 2, 10);
        empWageBuilder.addEmpWage("Infosys", 10, 3, 20);
        empWageBuilder.addEmpWage("Wipro", 15, 2, 20);
        empWageBuilder.addEmpWage("Magic edTech", 20, 2, 10);
        empWageBuilder.empWageComputation();
        System.out.println("Total Wage for TCS : " +empWageBuilder.getTotalWage("TCS"));
        System.out.println("Total Wage for Infosys : " +empWageBuilder.getTotalWage("Infosys"));
        System.out.println("Total Wage for Wipro : " +empWageBuilder.getTotalWage("Wipro"));
        System.out.println("Total Wage for Magic edTech : " +empWageBuilder.getTotalWage("Magic edTech"));
    }
}