package question02;
import java.util.Scanner;
class car{
    Scanner input = new Scanner(System.in);
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
            System.out.print("Do you renting the car(y/n)?");
            char choice = input.next().charAt(0);
            if(choice == 'y'){
                System.out.println("succesfull");
                isAvilable = false;
            }
            else if (choice == 'n'){
                System.out.println("Come again!");
            }
        }
        else{
            System.out.println("Sorry we don't have the car");
        }
    }
}
public class AbcCompaney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        car obj1 = new car("E001", "i8", "Audi");
        System.out.println(obj1.getRNumber());
        System.out.println(obj1.getCheckAvailability());
        obj1.rentCar();
    }
}