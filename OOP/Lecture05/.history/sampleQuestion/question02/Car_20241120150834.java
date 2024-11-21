package samplequestion.question02;
public class Car{
    private String registrationNumber;
    private String model;
    private String brand;
    private boolean isAvailable;
    
    public Car(String registrationnumber, String model, String brand) {
        this.registrationNumber = registrationnumber;
        this.model = model;
        this.brand = brand;
        this.isAvailable = true; // Default value set to true
    }
}
