package question01;
class employee{
    protected int employeeId;
    protected String name;
    protected double basicSalary, projectBouns, performanceBouns;

    public void setInputData(int empId, String Name, double basicsalary){
        employeeId = empId;
        name = Name;
        basicSalary = basicsalary;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public String getName(){
        return name;
    }

}
class seniorEngineer extends employee{

}
public class question01 {
    public static void main(String[] args) {
        employee obj1 = new employee();
        obj1.setInputData(100, "udani", 10000);
        System.out.println(obj1.getEmployeeId());
        System.out.println(obj1.getName());
    }
}
