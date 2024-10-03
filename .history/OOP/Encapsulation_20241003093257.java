class shopBilling(){
    int itemCode,idtemQuantity;
    double itemPrice,totalAmount;
    String itemName;
    void fnInputData(){
        System.out.println("Enter the item code");
    }
    void fnProcessData(){
        System.out.println("Processing data");
    }
    void fnDisplayData(){
        System.out.println("Displaying data");
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        shopBilling bill = new shopBilling();
        bill.fnInputData();
        bill.intemCode = 101;
        bill.itemQuantity = 2;
        
    }
}
