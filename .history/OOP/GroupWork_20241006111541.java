//     Question 01
// Class Magazine has private properties as magazine code, number of pages, cost for a page and total
// cost. The function inputData() is to input values for code, number of pages and cost for a page of a
// magazine. The function CalculateTotalCost() is used to find the total cost of a magazine. The function
// displayCost() is used to display the total cost of a magazine. Write an object program to set details, find
// cost and display cost of a magazine.
// Info: total cost=cost for a page * number of pages
// import java.util.Scanner;

class Magazine{
    private int MagazineCode,NumberOfPages;
    private double CostForThePage,TotalAmount;

    public void InputData(int MgCode,int NoPages,double PageCost){
        MagazineCode = MgCode;
        NumberOfPages = NoPages;
        CostForThePage = PageCost;
    }
    public void CalculateTotalCost(){
        TotalAmount = NumberOfPages * CostForThePage;
    }
    public void DisplayCost(){
        System.out.println("The Total Cost For The Page is " + TotalAmount);
    }

}

public class GroupWork {

    public static void main(String[] args) {
        int MagazineCode,NumberOfPages;
        double CostForThePage;
        Magazine magazine1 = new Magazine();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Magazine Code- ");
        MagazineCode = input.nextInt();

        System.out.print("Enter the Number Of Pages- ");
        NumberOfPages = input.nextInt();

        System.out.print("Enter the Cost For The Page- ");
        CostForThePage = input.nextDouble();
        
        magazine1.InputData(MagazineCode,NumberOfPages,CostForThePage);
        magazine1.CalculateTotalCost();
        magazine1.DisplayCost();
    }
}

import java.util.Scanner;

// LoanAccount class initialization
class LoanAccount {
    private String accountNumber, accountHolderName;
    private double loanAmount, interestRate, balance, monthlyPayment;
    private int loanTerm;

    // Account Number Method
    public void setaccountNumber(String accountNumber) {
        if (accountNumber == null) {
            System.err.println("Enter a valid Account Number!");
        } else {
            this.accountNumber = accountNumber;
        }
    }

    public String getaccountNumber() {
        return this.accountNumber;
    }

    // Account holder name method
    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName.isEmpty()) {
            System.err.println("Please Enter a Valid Name!");
        } else {
            this.accountHolderName = accountHolderName;
        }
    }

    // Loan amount method
    public double getLoanAmount() {
        return this.loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if (loanAmount > 0) {
            this.loanAmount = loanAmount;
            this.balance = loanAmount; // Initialize the balance with the loan amount
        } else {
            System.err.println("The loan amount you entered is insufficient!");
        }
    }

    // Interest rate method
    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate > 0 && interestRate < 100) {
            this.interestRate = interestRate;
        } else {
            System.out.println("The interest rate you entered is not valid");
        }
    }

    // Loan term method
    public int getLoanTerm() {
        return this.loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        if (loanTerm >= 1 && loanTerm <= 30) {
            this.loanTerm = loanTerm;
        } else {
            System.out.println("Loan term must be between 1 and 30 years.");
        }
    }

    // Monthly payment method
    public double getMonthlyPayment() {
        monthlyPayment = loanAmount / (loanTerm * 12);
        return this.monthlyPayment;
    }

    // Balance method
    public double getBalance() {
        return this.balance;
    }

    public void makePayment(double payment) {
        if (payment <= balance) {
            this.balance -= payment;
            System.out.println("Payment successful. Remaining balance: " + this.balance);
        } else {
            System.out.println("Payment exceeds the balance");
        }
    }
}

public class GroupWork {

    public static void main(String[] args) {
        // Object for the class loan account
        LoanAccount loan = new LoanAccount();
        // Object for Scanner library
        Scanner scan = new Scanner(System.in);

        // Variables for the user input
        String accountNumber, accountHolderName;
        double loanAmount, interestRate, makePayment;
        int loanTerm;

        // User inputs
        System.out.print("Enter The account Number: ");
        accountNumber = scan.nextLine();

        System.out.print("Enter The Account Holder Name: ");
        accountHolderName = scan.nextLine();

        System.out.print("Enter The Loan Amount: ");
        loanAmount = scan.nextDouble();

        System.out.print("Enter The Interest Rate: ");
        interestRate = scan.nextDouble();

        System.out.print("Enter The Loan Term (years): ");
        loanTerm = scan.nextInt();

        System.out.print("Enter Your Payment Amount: ");
        makePayment = scan.nextDouble();

        // Save all user data using loan object
        loan.setAccountHolderName(accountHolderName);
        loan.setaccountNumber(accountNumber);
        loan.setInterestRate(interestRate);
        loan.setLoanTerm(loanTerm);
        loan.setLoanAmount(loanAmount);

        // Making payment and updating balance
        loan.makePayment(makePayment);

        // Output the loan details
        System.out.println("Account Holder Name: " + loan.getAccountHolderName());
        System.out.println("Account Number: " + loan.getaccountNumber());
        //System.out.println("Balance amount to pay (without interest amount): " + loan.getBalance());
        System.out.println("Interest Rate: " + loan.getInterestRate());
        System.out.println("Loan Term (years): " + loan.getLoanTerm());
        System.out.println("Loan Amount: " + loan.getLoanAmount());
        System.out.println("Your Monthly Payment: " + loan.getMonthlyPayment());
    }
}



