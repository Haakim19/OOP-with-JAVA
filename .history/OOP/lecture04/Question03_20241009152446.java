class Employee{
    protected int empId;
    protected String name;
    protected double salary;
}
class Developer extends Employee{
    String Language;

}
class ProjectManager extends Employee{
    int numberOfProject;
}
class SeniorManager extends ProjectManager{
    int teamsize;
}

public class Question03 {
    public static void main(String[] args) {
        Developer emp1 = new Developer();
        SeniorManager emp2 = new SeniorManager();
    }
}
