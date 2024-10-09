class Employee{
    protected int empId;
    protected String name;
    protected double salary;
}
class Developer extends Employee{
    String Language;
    public void setEmployeeDetails(int id , String name, double salary, String lng){
        empId = id;
        name = name;
        salary = salary;
        Language = lng;
    }

}
class ProjectManager extends Employee{
    int numberOfProject;
}
class SeniorManager extends ProjectManager{
    int teamsize;
    public void setEmployeeDetails(){

    }
}

public class Question03 {
    public static void main(String[] args) {
        Developer emp1 = new Developer();
        SeniorManager emp2 = new SeniorManager();
        emp1.setEmployeeDetails(1001,"Ahamed",100000,"Java");
        emp2.setEmployeeDetails(1002, "Zoro",250000, 20 , 8);
    }
}
