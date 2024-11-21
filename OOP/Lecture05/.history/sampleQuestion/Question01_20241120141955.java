package samplequestion;
class employee{
    protected int empId;
    protected String name;
    protected double basicSalary,projectBonus,performanceBonus,finalSalary;
    
    public void setInput1(int id,String Name,double Bsalary){
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
    public void setInput2(int id,String Name,double Bsalary,double Pbouns, double Pfbouns){
        empId = id;
        name = Name;
        basicSalary = Bsalary;
        projectBonus = Pbouns;
        performanceBonus = Pfbouns;
    }
    public void setfinalSalary(){
        finalSalary = basicSalary + performanceBonus + projectBonus;
    }
    public double getFinalSalary(){
        return finalSalary;
    }
    
    
}
public class Question01 {
    public static void main (String[] args){
        System.out.println("TECHSTROM");
        employee obj1 = new employee();
        seniorEngineer obj2 = new seniorEngineer();
        obj1.setInput1(100,"Zoro", 10000);
        obj2.setInput2(101,"Ahamed", 20000,1000,1000);
    }
}
