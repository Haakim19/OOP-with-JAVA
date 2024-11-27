package task01;
import java.util.*;
public class AbcHotel {
    
    public static void main(String[] args) {
        Room room = new Room();
        char roomType;
        int guestType,numberFoDays;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rooom Type(A/B):");
        roomType = input.next().toUpperCase().charAt(0);
        System.out.println("Guest Type (1/2):");
        guestType = input.nextInt();
        System.out.println("Number of days:");
        numberFoDays = input.nextInt();
        room.calculateAmount(roomType, guestType, numberFoDays);

    }
}
