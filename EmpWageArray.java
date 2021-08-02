public class EmpWageArray {

    public static final  int partTime = 1;
    public static final int fullTime = 2;

    private int numOfCompanies=0;
    private EmpWage[] empWageArray;


    public EmpWageArray() {

	    empWageArray = new EmpWage[5];
	 
    }
 
    private void addEmpWage (String company, int empRatePerHour, int numberOfWorkingDays, int hrsPerMonth) {
	 
	    empWageArray[numOfCompanies]= new EmpWage(company, empRatePerHour, numberOfWorkingDays, hrsPerMonth);
	        numOfCompanies ++;
	 
    }

	
    private void empWageComputation() {
	
	    for(int i=0; i < numOfCompanies; i++) {
	        empWageArray[i].setTotalEmpWage(this.empWageComputation(empWageArray[i]));
	        System.out.println(empWageArray[i]);	
	    }        
    }

    private int empWageComputation(EmpWage empWage) {

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

    }
}