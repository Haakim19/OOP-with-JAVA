abstract class Vehicle {
    public abstract void speedUp();
}
class Car extends Vehicle{
    public void speedUp(int a){
        System.out.println("top speed - 300 km/h");
    }
}
class Bicycle extends Vehicle{
    public void speedUp(int a) {
        System.out.println("top speed - 20 km/h");
    }
    
}
public class Question {
    public static void main(String[] args) {
        Car obj1 = new Car();
        Bicycle obj2 = new Bicycle();
        obj1.speedUp(100);
        obj2.speedUp(100);
    }
    
}
