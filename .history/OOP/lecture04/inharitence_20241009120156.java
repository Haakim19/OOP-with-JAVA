
// import java.util.Scanner;

// class Employee{
//     protected int empId;
//     protected String empName;
//     protected double empSalary;

    
//     public void input (){
        
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter employee name - ");
//         empName = scan.next();
//         System.out.print("Enter employee id - ");
//         empId = scan.nextInt();
//         System.out.print("Enter employee salary - ");
//         empSalary = scan.nextDouble();

//     }
//     public void display(){
//         System.out.println("Id - " + empId );
//     }
    
// }
// class SoftwareEngineer extends Employee{
//     public double bonusAmount;
//     public void setBonusAmount(double amount){
//         bonusAmount = amount;
//     }
//     public void calculateAndDisplaySalary(){
//         System.out.print ("Net Salary - " + (empSalary + bonusAmount));
//     }
// } 
// public class Inharitence {
//     public static void main(String[] args) {
//         SoftwareEngineer Engineer = new SoftwareEngineer();
//         Engineer.input();
//         Engineer.setBonusAmount(10000);
//         Engineer.calculateAndDisplaySalary();
//     }
// }
//! Multilevel Inharitence
// class A {
//     public void funA(){  
//     }
// }
// class B extends A{
//     public void funB(){

//     }
// }
// class C extends B{

// }
// public class Inharitence{
//     public static void main (String[] args){
//         C obj = new C();
//         obj.funA();
//         obj.funB();
//     }
// }
//? Hierarchylevel Inharitence
class A{
    funA(){}
}
class B extends A{
    funB(){

    }
}
class C extends A{

}
public class Inharitence{
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.fu
    }
}