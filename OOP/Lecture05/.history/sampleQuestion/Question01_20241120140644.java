package samplequestion;
class employee{
    protected int empId;
    protected String name;
    protected double basicSalary,projectBonus,performanceBonus,finalSalary;
    
    public void input1(){

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
    public double getProjectBonus(){
        return projectBonus;
    }
    public double getPerformenceBouns(){
        return performanceBonus;
    }
    
}
class seniorEngineer extends employee{
    public void setfinalSalary(){

    }
    
}
public class Question01 {
    public static void main (String[] args){
        System.out.println("TECHSTROM");
        
    }
}
