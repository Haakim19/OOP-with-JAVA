package question02;
class Product extends AbcStore{
    private String productName;
    private int productId;
    private double pricePerUnit;
    private int stockQuantity;

    public void setProductName(String Pname){
        productName = Pname;
    }
    public String getProductName(){
            return productName;
    }
    public void setProductId(int Pid){
        productId = Pid;
    }
    public int getProductId(){
            return productId;
    }
    public void setProductPerUnit(double Punit){
        pricePerUnit = Punit;
    }
    public double getProductPerUnit(){
            return pricePerUnit;
    }
    public void setStockQuantity(int quantity){
        stockQuantity = quantity;
    }
    public double getStockQuantity(){
            return stockQuantity;
    }

}
