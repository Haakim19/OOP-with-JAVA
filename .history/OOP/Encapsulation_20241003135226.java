// class shopBilling{
//     public int itemCode;
//     public double itemPrice,totalAmount,idtemQuantity;
//     public String itemName;

//     public void fnInputData(){
//         System.out.println("Enter the item code");
//     }
//     public void fnProcessData(){
//         System.out.println("Processing data");
//     }
//     public void fnDisplayData(){
//         System.out.println("Displaying data");
//     }
// }


// class bankAccount{
//     private String accountNumber;
//     private String accountName;
//     private double balance;

//     public void fnSteData(String accNo,String accName,double bal){
//         accountNumber = accNo;
//         accountName = accName;
//         balance = bal;

//     }
//     public void fnWithdrowAmmount(double witdrow){
//         if (witdrow < balance){
//             System.out.println("You can make a Withdrow");
//             balance -= witdrow;
//         }
//     }
//     public void fnDepositAmmount(double blnc){
//         balance += blnc;
//         System.out.println("New balance - " + balance);
//     }
// }

// public class Encapsulation {
//      public static void main(String[] args) {
//         shopBilling item = new shopBilling();
//         bankAccount account = new bankAccount();
//         account.fnSteData("0111234","John Doe",1000);
//         account.fnDepositAmmount(10000);
//         account.fnWithdrowAmmount(20000);
//     }
// }

class Product{
    private int productId,quantity ;
    private String productName;
    private double price;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0){
            System.err.println("quantity can't be a negative value");
        }
        else{
        this.quantity = quantity;
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
       if (price > 0){
        this.price = price;
       }
       else {
           System.err.println("Price Should be Positive Value!");
       }
    } 
    
}

public class Encapsulation {
    public static void main(String[] args) {
        Product Product1 = new Product();
        
        Product1.setPrice(-100000);
        Product1.setProductId(11232);
        Product1.setProductName("Laptop");
        Product1.setQuantity(1);
        
        Product1.getProductId();
        Product1.getProductName();
        Product1.getPrice();
        System.out.println("Total = " + (Product1.getPrice() * Product1.getQuantity()));
    }
}


