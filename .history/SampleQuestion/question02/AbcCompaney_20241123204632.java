package question02;
class car{
    private String rNumber,model,brand;
    private boolean isAvilable = true;
    public car(String rnumber,String model,String brand){
        this.rNumber = rnumber;
        this.model = model;
        this.brand = brand;
    }
    public String getRNumber(){
        return rNumber;
    }
    // public void test(){
    //     System.out.println("bye");
    // }
}
public class AbcCompaney {
    public static void main(String[] args) {
        car obj1 = new car("E001", "i8", "Audi");
        obj1.getRNumber();
        // obj1.test();
    }
}
