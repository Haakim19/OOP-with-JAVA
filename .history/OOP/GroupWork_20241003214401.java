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
            System.err.println("Enter a valid Account Number!");
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
            System.err.println("Please Enter a Valid Name!");
        }
        else {
            this.accountHolderName = accountHolderName;
        }
    }

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
    
    public int getLoanTerm() {
        return this.loanTerm;
    }
    
    public void setLoanTerm(int loanTerm) {
        if (loanTerm => 1 || loanTerm <=30){
            this.loanTerm = loanTerm;
        }
    }
    
    public double getBalance() {
        return balance = loanAmount / (loanTerm * 12);
    }
}
public class GroupWork{
    
    public static void main(String[] args) {
        LoanAccount Loan = new LoanAccount();
        Scanner scan = new Scanner();
        String accountNumber, accountHolderName;
        double loanAmount, intrestRate;
        int loanTerm;
        System.out.println("Enter The account Number- ");
        accountNumber = scan.nextString();
        
        System.out.println("Enter The Account Holder Name- ");
        accountHolderName = scan.nextString();

        System.out.println("Enter The Loan Amount- ");
        loanAmount = scan.nextDouble();
        
        System.out.println("Enter The Intrest Rate- ");
        intrestRate = scan.nextDouble();
        
        
        Loan.setAccountHolderName();
        Loan.setaccountNumber();
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


