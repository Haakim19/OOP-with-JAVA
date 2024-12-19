package question02;
import java.util.Scanner;
class Car {
    private String registrationNumber;
    private String model;
    private String brand;
    private boolean isAvailable;

    // Constructor to initialize the car details
    public Car(String registrationNumber, String model, String brand) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.brand = brand;
        this.isAvailable = true; // Initially, the car is available
    }

    // Method to rent the car
    public boolean rentCar() {
        if (isAvailable) {
            isAvailable = false; // Mark the car as rented
            System.out.println("Car rented successfully: " + model + " (" + registrationNumber + ")");
            return true;
        } else {
            System.out.println("Car is not available for rent: " + model + " (" + registrationNumber + ")");
            return false;
        }
    }

    // Method to return the car
    public void returnCar() {
        isAvailable = true; // Mark the car as available
        System.out.println("Car returned successfully: " + model + " (" + registrationNumber + ")");
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    // Getter for registration number
    public String getRegistrationNumber() {
        return registrationNumber;
    }
}


public class AbcCompaney {
    private Car car;

    public AbcCompaney() {
        // Initialize one car
        car = new Car("ABC123", "Model S", "Tesla");
    }

    // Method to display the car in the inventory
    public void displayCar() {
        System.out.println("Current Car Inventory:");
        car.displayDetails();
        System.out.println();
    }

    public static void main(String[] args) {
        AbcCompaney rentalSystem = new AbcCompaney();
        Scanner scanner = new Scanner(System.in);

        // Display the car
        rentalSystem.displayCar();

        // Renting a car
        System.out.print("Enter the registration number of the car to rent: ");
        String regNumberToRent = scanner.nextLine();
        if (regNumberToRent.equalsIgnoreCase(rentalSystem.car.getRegistrationNumber())) {
            rentalSystem.car.rentCar();
        } else {
            System.out.println("Car not found.");
        }

        // Returning a car
        System.out.print("Enter the registration number of the car to return: ");
        String regNumberToReturn = scanner.nextLine();
        if (regNumberToReturn.equalsIgnoreCase(rentalSystem.car.getRegistrationNumber())) {
            rentalSystem.car.returnCar();
        } else {
            System.out.println("Car not found.");
        }

        // Display the car after renting and returning
        System.out.println("\nUpdated Car Inventory:");
        rentalSystem.displayCar();

        scanner.close();
    }
}