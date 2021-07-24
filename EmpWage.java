import javax.lang.model.util.ElementScanner14;

public class EmpWage {
    public static void main (String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem");
        int Part_Time = 1;
        int Full_Time = 2;
        int Emp_Rate_Per_Hour = 20;

        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == Full_Time) 
            empHrs = 8;
        else if (empCheck == Part_Time)
            empHrs = 4;
        empWage = empHrs * Emp_Rate_Per_Hour;
        System.out.println("Employee Wage is : " +empWage);
    }
}