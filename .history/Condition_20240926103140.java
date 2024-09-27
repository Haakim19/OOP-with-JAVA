
import java.util.Scanner;
public class Condition {
    public static void main(String[] args) {
       try (Scanner aj = new Scanner(System.in)) {
        System.out.print("Enter you name: ");
           String name = aj.nextLine();
           System.out.print("Enter your age: ");
           int age = aj.nextInt();
           System.out.println("your name is " + name);
           if (age < 20) {
            System.out.println("palayan podi eka");
        }
        
        else if (age > 20 ) {
            System.out.println("haa sudda komada");
        }
        else if (age > 30 ){
               System.out.println("nakiya");
           }
    }
       
    }
}
