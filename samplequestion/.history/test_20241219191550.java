
class employee {
    protected int employeeId;
    protected String name;
    protected double basicSalary, projectBouns, performanceBouns, finalSalary;

    public void setInputData(int empId, String Name, double basicsalary) {
        employeeId = empId;
        name = Name;
        basicSalary = basicsalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
}

class seniorEngineer extends employee {
    public void setInputData(int empId, String Name, double basicsalary, double pBouns, double pfBouns) {
        // Use super to call the method from the superclass
        super.setInputData(empId, Name, basicsalary);
        projectBouns = pBouns;
        performanceBouns = pfBouns;
    }

    public void setFinalSalary() {
        finalSalary = basicSalary + projectBouns + performanceBouns;
    }

    public double getFinalSalary() {
        return finalSalary;
    }
}

public class test {
    public static void main(String[] args) {
        employee obj1 = new employee();
        seniorEngineer obj2 = new seniorEngineer();

        obj1.setInputData(100, "udani", 10000);
        // System.out.println(obj1.getEmployeeId());
        // System.out.println(obj1.getName());
        obj2.setInputData(101, "Zoro", 12000, 1000, 1000);
        obj2.setFinalSalary();
        System.out.println("Employee Id- " + obj2.getEmployeeId());
        System.out.println("Employee Name- " + obj2.getName());
        System.out.println("Final Income- " + obj2.getFinalSalary());
    }
}

