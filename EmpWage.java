import javax.lang.model.util.ElementScanner14;

public class EmpWage {
    public static void main (String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem");
        int Full_Time = 1;
        int Emp_Rate_Per_Hour = 20;

        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == Full_Time) 
            empHrs = 8;
        else 
            empHrs = 0;
        empWage = empHrs * Emp_Rate_Per_Hour;
        System.out.println("Employee Wage is : " +empWage);
    }
}