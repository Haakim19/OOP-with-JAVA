//package mypackage;
//
//import java.util.Scanner;
//
//public class DriverClass {
//    public static void main(String[] args) {
//           Scanner input = new Scanner(System.in);
//        System.out.print("Enter you name- ");
//        String name = input.nextLine();
//        System.out.println("Hello " + name);
         
        
//        double num= 0;
//        double total = 0;
//        
//        for (int i = 0; i < 3 ; i++){
//            
//            System.out.print("Enter Number- "); 
//            num = input.nextInt();
//            total = total + num ;
//        
//        }
//        
//        double avg = total / 3;
//        System.out.println(avg);
        


//        Q01.Develop a java Program to input tree numbers and desplay the maximum number
//        int num1,num2,num3= 0;
//        
//        System.out.print("Enter Number 01- "); 
//        num1 = input.nextInt();
//        System.out.print("Enter Number 02- "); 
//        num2 = input.nextInt();
//        System.out.print("Enter Number 03- "); 
//        num3 = input.nextInt();
//        
        
//        System.out.println(Math.max(num3, Math.max(num1, num2)));
       
//        for(int i = 1 ; i < 21 ; i ++ ){
//            int num = i % 2;
//            if (num == 0 ){
//                System.out.println(i);
//            }



//            Q02. Develop a java program to insert the prices of 10 product and desplay the avarage price
//        double total = 0;
//       
//        int x = 0;
//        while(x <10){
//            System.out.print("Enter the Product Price- ");
//            total = total + input.nextDouble();
//            x++;
//        }
//            System.out.print("Avarage price- " + total/10);
//        }
//         
//        int[] numbers = new int [5];
//        for (int i = 0 ; i <5 ; i ++){
//            System.out.print("Enter number- ");
//            numbers[i] = input.nextInt();
//        }
//        for (int x : numbers){
//            System.out.print(x + " ");
//        }
//
//
//
//    }
//}

import java.util.Scanner;
class LoanAccount{
    private String accountNumber, accountHolderName;
    private double loanAmount, intrestRate, balance;
    private int loanTerm;

    public String setaccountNumber(){

    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getIntrestRate() {
        return intrestRate;
    }

    public void setIntrestRate(double intrestRate) {
        this.intrestRate = intrestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }
    public void getaccountNumber(){

    }
    public 

    public static void main(String[] args) {
        
    }
}



