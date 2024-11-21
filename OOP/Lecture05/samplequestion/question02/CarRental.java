package samplequestion.question02;
import java.util.Scanner;


public class CarRental {
    public static void main(String[] args) {
        Scanner inupt = new Scanner(System.in);
        Car obj1 = new Car("ABC-0012", "i8","Audi");
        Car obj2 = new Car("DEF-0022", "Gost","Rollce Roice");
        System.out.println("-Choose the option-");
        System.out.println("1-Rent Car");
        System.out.println("2- Car");

        System.out.println(obj1.getRegistrationNumber());
        
    }
}
