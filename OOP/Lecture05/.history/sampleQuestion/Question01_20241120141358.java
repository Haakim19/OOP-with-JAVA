package samplequestion;
class employee{
    protected int empId;
    protected String name;
    protected double basicSalary,projectBonus,performanceBonus,finalSalary;
    
    public void input1(int id,String Name,double Bsalary,){
        empId = id;
        name = Name;
        basicSalary = Bsalary;
    }
    public int getEmpId(){
            return empId;
    }
   
    public String getName(){
        return name;
    }
    public double getBasicSalary(){
        return basicSalary;
    } 
    
    
}
class seniorEngineer extends employee{
    public void input1(int id,String Name,double Bsalary,double Pbouns, double Pfbouns){
        empId = id;
        name = Name;
        basicSalary = Bsalary;
        projectBonus = Pbouns;
        performanceBonus = Pfbouns;
    }
    public void setfinalSalary(){
        finalSalary = basicSalary + performanceBonus + projectBonus;
    }
    public double getProjectBonus(){
        return projectBonus;
    }
    public double getPerformenceBouns(){
        return performanceBonus;
    }
    
}
public class Question01 {
    public static void main (String[] args){
        System.out.println("TECHSTROM");
        employee obj1 = new employee();
        obj1.input1(100,"Zoro", 10000);
        
    }
}
