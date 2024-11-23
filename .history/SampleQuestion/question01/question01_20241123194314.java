package question01;
class employee{
    protected int employeeId;
    protected String name;
    protected double basicSalary, projectBouns, performanceBouns;

    public void setInputData1(int empId, String Name, double basicsalary){
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
    public double getBasicSalary(){
        return basicSalary;
    }

}
class seniorEngineer extends employee{
    public void setInputData2(int empId, String Name, double basicsalary, double pBouns, double pfBouns){
        employeeId = empId;
        name = Name;
        basicSalary = basicsalary;
        projectBouns = pBouns;
        performanceBouns = pfBouns;
    }
    
    

}
public class question01 {
    public static void main(String[] args) {
        employee obj1 = new employee();
        seniorEngineer obj2 = new seniorEngineer();

        obj1.setInputData1(100, "udani", 10000);
        System.out.println(obj1.getEmployeeId());
        System.out.println(obj1.getName());
        obj2.setInputData2(101, "Zoro", 12000, 1000, 1000);
    }
}
