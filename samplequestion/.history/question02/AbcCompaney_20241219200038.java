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