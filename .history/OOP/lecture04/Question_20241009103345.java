import java.util.Scanner;

class Customer{
    protected int customerCode;
    protected double customerBillAmount;

    //?Customer code & customer bill amount
    public void setCustometData(int cstCode, double cstBillAmount){
        customerCode = cstCode;
        customerBillAmount = cstBillAmount;
    }
}
class loyaltyCustomer extends Customer{
    //? 
    public void loyaltyCustomer(){
        private double dicountRate;
        if (customerBillAmount < 5000) {
            dicountRate = 0.05;
        }
        else if (customerBillAmount > 5000){
            dicountRate = 0.1
        }
        else if (customerBillAmount > 10000){
            dicountRate = 0.15;
        }
    }
    //? set dicount rate for the customer
    public void setLoyaltyData(){
        
    }
    //? display dicount for the bill
    public void findDiscount(){

    }
}
public class Question {
    public static void main(String[] args) {
        int customerCode;
        double customerBillAmount;
        
        Scanner scan = new Scanner();
        Customer cst1 = new Customer();
        
        System.out.println("**** Welcome! ****");
        System.out.print("Cutomer Code - ");
        customerCode = scan.nextInt();
        System.out.print("Bill Amount - ");
        customerBillAmount = scan.nextDouble();
        cst1.setCustometData(customerCode,customerBillAmount);
        
    }
}
