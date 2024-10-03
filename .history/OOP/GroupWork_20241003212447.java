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
class LoanAccount{
    private String accountNumber, accountHolderName;
    private double loanAmount, intrestRate, balance;
    private int loanTerm;

    //? Account Number Method
    public void setaccountNumber(String accountNumber){
        if (accountNumber == null){
            System.out.println("Enter a valid Account Number");
        }
        else {
            this.accountNumber = accountNumber;
        }
    }
    public String getaccountNumber(){
        return this.accountNumber;
    }
    
    public String getAccountHolderName() {
        return this.accountHolderName;
    }
    
    public void setAccountHolderName(String accountHolderName) {
        
        if(accountHolderName.trim().isEmpty){
            System.out.println("Please Enter a Valid Name!");
        }
        else {
            this.accountHolderName = accountHolderName;
        }
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
     

}
public class GroupWork{
    
    public static void main(String[] args) {
        LoanAccount Loan = new LoanAccount();

        Loan.setAccountHolderName();
        Loan.setaccountNumber();
        Loan.setBalance();
        Loan.setIntrestRate();
        Loan.setLoanTerm();
        Loan.setLoanAmount();

        Loan.getAccountHolderName();
        Loan.getaccountNumber();
        Loan.getBalance();
        Loan.getIntrestRate();
        Loan.getLoanTerm();
        Loan.getLoanAmount();
    }
}


