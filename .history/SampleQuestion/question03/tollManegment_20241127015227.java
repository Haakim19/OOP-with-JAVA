package question03;
import java.util.Scanner;
abstract class Vehicle {
    abstract double calculateTollCharge();
    double totalAmount = 0;
}
class Car extends Vehicle{
    
}
class Truck extends Vehicle{
    double calculateTollCharge(double nTolls){
        totalAmount = nTolls * 5;
        return totalAmount;
    }
}
class Mortocycle extends Vehicle{
    double calculateTollCharge(double nTolls){
        totalAmount = nTolls * 1;
        return totalAmount;
    }
}
public class tollManegment {
    public static void main(String[] args) {
        double amount = 0,nTolls = 0;
        Car obj1 = new Car();
        Truck obj2 = new Truck();
        Mortocycle obj3 = new Mortocycle();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the type of vehicle(Car/Truck/Mortocycle):");
        String type = input.next();
        System.out.print("Number of tolls passed: ");
        nTolls = input.nextDouble();
        switch (type) {
            case "Car":
                amount = obj1.calculateTollCharge(nTolls);
                break;
            case "Truck":
                amount = obj2.calculateTollCharge(nTolls);
                break;
            case "Mortocycle":
                amount = obj3.calculateTollCharge(nTolls);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        System.out.println("Total toll amount: "+amount);
    }
}
