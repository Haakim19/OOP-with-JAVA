public class Cunstructors {
    int x; // Create a class attribute

    // Create a class constructor for the Main class
    public Cunstructors() {
        x = 5; // Set the initial value for the class attribute x
        System.out.println("I am the constructor");
    }

    public static void main(String[] args) {
        Cunstructors myObj = new Cunstructors(); // Create an object of class Main (This will call the constructor)
        // System.out.println(myObj.x); // Print the value of x
    }
    
}