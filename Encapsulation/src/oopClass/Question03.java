package oopClass;

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

public class Question03 {
    public static void main(String[] args) {
        Product Product1 = new Product();
        
        Product1.setPrice(100000);
        Product1.setProductId(11232);
        Product1.setProductName("Laptop");
        Product1.setQuantity(1);
        
        Product1.getProductId();
        Product1.getProductName();
        Product1.getPrice();
        System.out.println("Total = " + (Product1.getPrice() * Product1.getQuantity()));
    }
}
