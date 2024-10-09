class Employee{
    protected String EmpId,Name;
    protected double basicSalary,allowence,incentive;

    public void setEmployeeDetails(){
        this.EmpId = Id;
        this.Name = name;
        this.basicSalary = salary;
    }
}

class Manager extends Employee{
    public void setManager(){
        this.allowence = allowence;
        this.incentive = incentive;
    }

}
public class Question02 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Manager emp2 = new Manager();
        emp1.EmpId = 100;
        emp1
        
        
    }
}
