package task01;
import java.util.*;
public class AbcHotel {
    
    public static void main(String[] args) {
        AbcHotel_ui ui = new AbcHotel_ui();
        Room room = new Room();
        String roomType;
        int guestType,numberFoDays;
        System.out.println("--AbcHotel--");
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the rooom Type(A/B):");
            roomType = input.next().toUpperCase();
            System.out.println("Guest Type (1/2):");
            guestType = input.nextInt();
            System.out.println("Number of days:");
            numberFoDays = input.nextInt();
        }
        double totalAmount = room.calculateAmount(roomType, guestType, numberFoDays);
        System.out.println("Final Amount to The Stay: " + totalAmount);
        
    }
}
