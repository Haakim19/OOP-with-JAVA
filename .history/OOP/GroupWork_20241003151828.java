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

class LoanAccount{
    private String accountNumber, accountHolderName;
    private double loanAccount, intrestRate, balance;
    private int loanTerm;

    
}
