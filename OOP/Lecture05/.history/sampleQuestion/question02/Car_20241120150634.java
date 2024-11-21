package samplequestion.question02;
public class Car{
    private String registrationNumber;
    private String model;
    private String brand;
    private boolean isAvailable;
    
    public Vehicle(String registrationNumber, String model, String brand) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.brand = brand;
        this.isAvailable = true; // Default value set to true
    }
}
