//     Question 01
// Class Magazine has private properties as magazine code, number of pages, cost for a page and total
// cost. The function inputData() is to input values for code, number of pages and cost for a page of a
// magazine. The function CalculateTotalCost() is used to find the total cost of a magazine. The function
// displayCost() is used to display the total cost of a magazine. Write an object program to set details, find
// cost and display cost of a magazine.
// Info: total cost=cost for a page * number of pages
// import java.util.Scanner;

// class Magazine{
//     private int MagazineCode,NumberOfPages;
//     private double CostForThePage,TotalAmount;

//     public void InputData(int MgCode,int NoPages,double PageCost){
//         MagazineCode = MgCode;
//         NumberOfPages = NoPages;
//         CostForThePage = PageCost;
//     }
//     public void CalculateTotalCost(){
//         TotalAmount = NumberOfPages * CostForThePage;
//     }
//     public void DisplayCost(){
//         System.out.println("The Total Cost For The Page is " + TotalAmount);
//     }

// }

// public class GroupWork {

//     public static void main(String[] args) {
//         int MagazineCode,NumberOfPages;
//         double CostForThePage;
//         Magazine magazine1 = new Magazine();
//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter the Magazine Code- ");
//         MagazineCode = input.nextInt();

//         System.out.print("Enter the Number Of Pages- ");
//         NumberOfPages = input.nextInt();

//         System.out.print("Enter the Cost For The Page- ");
//         CostForThePage = input.nextDouble();
        
//         magazine1.InputData(MagazineCode,NumberOfPages,CostForThePage);
//         magazine1.CalculateTotalCost();
//         magazine1.DisplayCost();
//     }
// }

import java.util.Scanner;
//loan account class intialization
class LoanAccount{
    private String accountNumber, accountHolderName;
    private double loanAmount, intrestRate, balance, makePayment = 0.0, monthlyPayment;
    private int loanTerm;

    // Account Number Method
    public void setaccountNumber(String accountNumber){
        if (accountNumber == null){
            System.err.println("Enter a valid Account Number!");
        }
        else {
            this.accountNumber = accountNumber;
        }
    }
    public String getaccountNumber(){
        return this.accountNumber;
    }
    //Account holder name method
    public String getAccountHolderName() {
        return this.accountHolderName;
    }
    
    public void setAccountHolderName(String accountHolderName) {
        if(accountHolderName.isEmpty()){
            System.err.println("Please Enter a Valid Name!");
        }
        else {
            this.accountHolderName = accountHolderName;
        }
    }
    //Loan amount method
    public double getLoanAmount() {
        return this.loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if (loanAmount > 0 ){
            this.loanAmount = loanAmount;
        }
        else{
            System.err.println("The Loan amount you enterd not shuficent!");
        }
    }
    //Intrest rate method
    public double getIntrestRate() {
        return this.intrestRate;
    }

    public void setIntrestRate(double intrestRate) {
        if (intrestRate > 0 && intrestRate < 100){
            this.intrestRate = intrestRate;
        }
        else {
            System.out.println("The intrest rate you enterd not valide");
        }
    }
    //loan term method
    public int getLoanTerm() {
        return this.loanTerm;
    }
    
    public void setLoanTerm(int loanTerm) {
        if (loanTerm >= 1 || loanTerm <=30){
            this.loanTerm = loanTerm;
        }
    }
    //balance calculating method
    public double getMonthlyPayment() {
        monthlyPayment = loanAmount / (loanTerm * 12);
        return monthlyPayment;
    }
    public double makePayment(double payment){
        
        if (balance < payment){
            System.out.println(" Payment exceeds the Balance ");
        }
        else{
            balance -=payment;
        }
        return balance;
    }
}
public class GroupWork{
    
    public static void main(String[] args) {
        //Object for the class loan account
        LoanAccount Loan = new LoanAccount();
        //object for Scanner library
        Scanner scan = new Scanner(System.in);
        
        //Variales for the user input
        String accountNumber, accountHolderName;
        double loanAmount, intrestRate,makePayment = 0.0;
        int loanTerm;
        String YesNo ;
        //User inputs 
        System.out.print("Enter The account Number- ");
        accountNumber = scan.nextLine();
        
        System.out.print("Enter The Account Holder Name- ");
        accountHolderName = scan.nextLine();

        System.out.print("Enter The Loan Amount- ");
        loanAmount = scan.nextDouble();
        
        System.out.print("Enter The Intrest Rate- ");
        intrestRate = scan.nextDouble();
        
        System.out.print("Enter The Loan Term- ");
        loanTerm = scan.nextInt();

        System.out.print("Do You Want to make a payment(Y/N)- ");
        YesNo = scan.next().charAt(0);

            if (YesNo == "Y" || YesNo == "y") {
            System.out.print("Your Monthly Payment Amount- ");
            makePayment = scan.nextDouble();
            }
            else{
            System.out.println("ThankYou!");
            }

        //save all user data using loan object
        Loan.setAccountHolderName(accountHolderName);
        Loan.setaccountNumber(accountNumber);
        Loan.setIntrestRate(intrestRate);
        Loan.setLoanTerm(loanTerm);
        Loan.setLoanAmount(loanAmount);
        Loan.makePayment(makePayment);

        System.out.println("Account Holder Name- " + Loan.getAccountHolderName());
        System.out.println("Account Number- " + Loan.getaccountNumber());
        System.out.println("Balance amount to pay (without intrest amount)- " + Loan.getBalance());
        System.out.println("Inrest Rate- " + Loan.getIntrestRate());
        System.out.println("Loan Term in Years- " + Loan.getLoanTerm());
        System.out.println("Loan Amount to Pay- " + Loan.getLoanAmount());
        System.out.println("Your Montly Payment- " + Loan.getMonthlyPayment());
    }
}


