package OOP.inharitence;
import java.util.Scanner;

class Employee{
    private int empId;
    private String empName;
    private double empSalary;

    public Employee (){
        input();
        display();
    }
    public void input (){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee name - ");
        empName = scan.next();
        System.out.println("Enter employee id - ");
        empId = scan.nextInt();
        System.out.println("Enter employee salary - ");
        empSalary = scan.nextDouble();

    }
    public void display(){
        System.out.println("Id - " + empId );
    }
}
public class inharitence {
    public static void main(String[] args) {
        Employee emp = new Employee();
        
        
    }
}
