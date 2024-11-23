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
    public boolean getCheckAvailability(){
        return isAvilable;
    }
    public void rentCar(){
        if (isAvilable == true){
            System.out.println("You can rent the car");
        }
        else{
            System.out.println("Sorry we don't have the car");
        }
    }
}
public class AbcCompaney {
    public static void main(String[] args) {
        car obj1 = new car("E001", "i8", "Audi");
        System.out.println(obj1.getRNumber());
        System.out.println(obj1.getCheckAvailability());
        obj1.rentCar();
    }
}
