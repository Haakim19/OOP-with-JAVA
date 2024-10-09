import java.util.Scanner;

class Customer{
    protected int customerCode;
    protected double customerBillAmount;

    //?Customer code & customer bill amount
    public void setCustometData(int cstCode, double cstBillAmount){
        this.customerCode = cstCode;
        this.customerBillAmount = cstBillAmount;
    }
}
class loyaltyCustomer extends Customer{
    private double dicountRate,dicountAmount,finalBill;
    public void LoyaltyCustomer(){

        
        if(customerBillAmount < 5000) {
            this.dicountRate = 0.05;
        }
        else if(customerBillAmount > 5000){
            dicountRate = 0.1;
        }
        else if(customerBillAmount > 10000){
            dicountRate = 0.15;
        }
    }
    //? set dicount rate for the customer
    public void setLoyaltyData(double discountRate){
        dicountAmount = customerBillAmount * dicountRate;
    }
    //? display dicount for the bill
    public void findDiscount(){
        System.out.print("Your Final Bill Amount is - " + (customerBillAmount - dicountAmount));
    }
}
public class Question {
    public static void main(String[] args) {
        int customerCode;
        double customerBillAmount;
        
        Scanner scan = new Scanner(System.in);
        loyaltyCustomer cst1 = new loyaltyCustomer();
        
        System.out.println("**** Welcome! ****");
        System.out.print("Cutomer Code - ");
        customerCode = scan.nextInt();
        System.out.print("Bill Amount - ");
        customerBillAmount = scan.nextDouble();
        cst1.setCustometData(customerCode,customerBillAmount);
        cst1.LoyaltyCustomer();
        
    }
}
