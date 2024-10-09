
import java.util.Scanner;

class Employee{
    protected int empId;
    protected String empName;
    protected double empSalary;

    
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
class SoftwareEngineer extends Employee{
    public double bonusAmount;
    public void setBonusAmount(double amount){
        bonusAmount = amount;
    }
    public void calculateAndDisplaySalary(){
        System.out.print ("Net Salary - " + (empSalary + bonusAmount));
    }
} 
public class Inharitence {
    public static void main(String[] args) {
        SoftwareEngineer Engineer = new SoftwareEngineer();
        Engineer.input();
        Engineer.setBonusAmount(10000);
        Engineer.calculateAndDisplaySalary();
        
        
    }
}
