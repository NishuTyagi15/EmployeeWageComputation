import javax.lang.model.util.ElementScanner14;

public class EmpWage {
    public static void main (String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem");
        int Full_Time = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == Full_Time) {
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
}