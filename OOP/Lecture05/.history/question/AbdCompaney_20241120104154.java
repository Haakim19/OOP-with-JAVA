package question;
import java.util.Scanner;
abstract class customer {
    public abstract double calculate(double purchaseAmount);
}

public class AbdCompaney {
    public static void main(String[] args) {
        int type =0;
        double purchaseAmount =0 ;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Customer type");
            System.out.println("1-Reguler");
            System.out.println("2-Corporate");
            System.out.println("3-Premium");
            type = input.nextInt();
            System.out.println("Amount-");
            purchaseAmount = input.nextDouble();
        }catch (Exception e) {
            System.err.println("Error");
        }
        switch (type) {
            case 1:
                RegulerCustomer obj1 = new RegulerCustomer();
                obj1.calculate(purchaseAmount);
                break;
            case 2:
                CorporateCustomer obj2 = new CorporateCustomer();
                obj2.calculate(purchaseAmount);
                break;
            case 3:
                PremiumCustomer obj3 = new PremiumCustomer();
                obj3.calculate(purchaseAmount);
                break;
            default:
                break;
        }
        System.out.println(type);
        System.out.println(purchaseAmount);
    }
}
