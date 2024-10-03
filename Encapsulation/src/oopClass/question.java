
package oopClass;

/*A factory produces electrical equipments for exporting to different countries.
Each equipment has equipment code, an equipment value and quantity exported from one type of equipment. 
The function setData() is used to set code, value and quantity to be exported of an equipment. 
The function calculateTotalValue() is used to find a total value of one type of equipment to be exported. 
The function showDetails() is used to display code and total value of one type of equipment to be exported. 
Write an object oriented program to set equipment details, 
get total value and display considering two equipments which are planned to export.   
Info: total value of one type equipment= an equipment value* quantity exported*/
//class Export{
//    private int equipmentCode;
//    private double equipmentValue,quantity;
//    
//    public void fnSteData(int eqcode,double qnt, double eqvalue ){
//        equipmentCode = eqcode;
//        quantity = qnt;
//        equipmentValue = eqvalue;
//    }
//    
//    public  double setfnCalculateTotalValue(){
//        return quantity * equipmentValue;
//    }
//    public void showDetails(){
//        System.out.println("The Equipment- "+ equipmentCode);
//        System.out.println("The Total Value is- " + setfnCalculateTotalValue());
//    }
//}
//public class question {
//    public static void main(String[] args) {
//        Export data1 = new Export();
//        Export data2 = new Export();
//        //Equipment 01
//        data1.fnSteData(10203, 10, 100000);
//        //Equipment 02
//        data2.fnSteData(10204, 10, 200000);
//        
//        System.out.println("Equipment 01 ");
//        data1.showDetails();
//        System.out.println("Equipment 01 ");
//        data2.showDetails();
//        
//    }
//    
//    
//}



//Question 02
class project{
    private int pId,projectDuration;
    private String projectName;
    
    public int getpid(int value){
        return pId;
    }
    public void stepid(int value){
        if (value % 2 == 0){
            pId = value;
        }
        else {
            System.out.println("Project Id should be Even Number");
        } 
    }
    public void setprojectDuration(int value){
        projectDuration = value;
    }
    public String getprojectName(String value){
        return projectName;
    }
}

public class question {
   public static void main(String[] args){
       
   }
           
           
}

