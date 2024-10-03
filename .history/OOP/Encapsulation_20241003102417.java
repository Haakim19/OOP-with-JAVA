class shopBilling(){
    public int itemCode;
    public double itemPrice,totalAmount,idtemQuantity;
    public String itemName;

    public void fnInputData(){
        System.out.println("Enter the item code");
    }
    public void fnProcessData(){
        System.out.println("Processing data");
    }
    public void fnDisplayData(){
        System.out.println("Displaying data");
    }

}


class bankAccount{
    private String accountNumber;
    private String accountName;
    private double balance;

    public void fnSteData(String accNo,String accName,double bal){
        accountNumber = accNo;
        accountName = accName;
        balance = bal;

    }
    public void fnWithdrowAmmount(double witdrow){
        if (witdrow < balance){
            System.out.println("You can make a Withdrow");
            balance -= witdrow;
        }
    }
    public void fnDepositAmmount(double blnc){
        balance += blnc;
        System.out.println("New balance - " + balance);
    }
}

public class DriverClass {
     public static void main(String[] args) {
        shopBilling item = new shopBilling();
        bankAccount account = new bankAccount();
        account.fnSteData("0111234","John Doe",1000);
        account.fnDepositAmmount(10000);
        account.fnWithdrowAmmount(20000);
    }
}



