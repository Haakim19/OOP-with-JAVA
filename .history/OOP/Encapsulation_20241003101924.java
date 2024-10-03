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
    public String accountNumber;
    public String accountName;
    public double balance;

    public void fnSteData(String accNo,String accName,double bal){
        accountNumber = accNo;
        accountName = accName;
        balance = bal;

    }
    public void fnWithdrowAmmount(){

    }
    public void fnDepositAmmount(){

    }
}

public class Encapsulation {
    public static void main(String[] args) {
        shopBilling bill = new shopBilling();
        bankAccount account = new bankAccount();
        account.fnSteData("0111234","John Doe",1000);
        
    }
}



