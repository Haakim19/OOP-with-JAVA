class Employee{
    protected String EmpId,Name;
    protected double basicSalary,allowence,incentive, totalSalary;

    public void setEmployeeDetails(String Id , String name, double salary){
        this.EmpId = Id;
        this.Name = name;
        this.basicSalary = salary;
    }
}

class Manager extends Employee{
    public void setManager(double allow , double incen){
        this.allowence = allow;
        this.incentive = incen;
    }
    public void calculateAndDisplaySalary(){
        this.totalSalary = basicSalary + allowence + incentive;
    }

}
public class Question02 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Manager emp2 = new Manager();
        emp1.setEmployeeDetails("100","Nico Robin" , 100000);
        emp2.setEmployeeDetails("101","Zoro" , 200000);
        emp2.setManager(10000,200);
        System.out.println(emp2.EmpId);
        System.out.println(emp2.Name);
        System.out.println(emp2.basicSalary);
        System.out.print("Total Salary is - " + emp2.totalSalary);
        
        
    }
}
