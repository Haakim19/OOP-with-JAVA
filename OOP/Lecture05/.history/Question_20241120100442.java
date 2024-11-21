abstract class Vehicle {
    public abstract void speedUp();
}
class Car extends Vehicle{
    public void speedUp(){
        System.out.println("top speed - 300 km/h");
    }
}
class Bicycle extends Vehicle{
    public void speedUp() {
        System.out.println("top speed - 20 km/h");
    }
    
}
public class Question {
    public static void main(String[] args) {
        Car obj1 = new Car();
        Bicycle obj2 = new Bicycle();
        obj1.speedUp();
        obj2.speedUp();
    }
    
}
