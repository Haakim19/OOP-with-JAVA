package question03;
import java.util.Scanner;
abstract class Vehicle {
    public abstract double calculateTollCharge();
}
class Car extends Vehicle{
    public double calculateTollCharge(){
        return 2;
    }
}
class Truck extends Vehicle{
    public double calculateTollCharge(){
        return 5;
    }
}
class Mortocycle extends Vehicle{
    public double calculateTollCharge(){
        return 1;
    }
}
public class tollManegment {
    public static void main(String[] args) {
        double amount = 0;
        Car obj1 = new Car();
        Truck obj2 = new Truck();
        Mortocycle obj3 = new Mortocycle();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the type of vehicle(Car/Truck/Mortocycle):");
        String type = input.next();
        switch (type) {
            case Car:
                amount = obj1.calculateTollCharge();
                break;
            case Truck:
                amount = obj2.calculateTollCharge();
                break;
            case Mortocycle:
                amount = obj3.calculateTollCharge();
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
