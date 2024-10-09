
import java.util.Scanner;

class Employee{
    private int empId;
    private String empName;
    private double empSalary;

    
    public void input (){
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter employee name - ");
        empName = scan.next();
        System.out.print("Enter employee id - ");
        empId = scan.nextInt();
        System.out.print("Enter employee salary - ");
        empSalary = scan.nextDouble();

    }
    public void display(){
        System.out.println("Id - " + empId );
    }
}
public class Inharitence {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.input();
        
    }
}
