class Appliance{
    private int applienceCode;
    private double appliencePrice,discountRate;

    
    public Applience(int apCode,double apPrice){
        this.applienceCode = apCode;
        this.appliencePrice = apPrice;
    }
    public Appliance (int apCode,double apPrice, double Rate){
        this.applienceCode = apCode;
        this.appliencePrice = apPrice;
        this.discountRate = Rate;
    }
    public void calculateSaleDiscount(){
        System.out.println("Appliecne Code - " + applienceCode);
        System.out.println("Discount Amount - " + (discountRate * appliencePrice));
        
    }
    
    

}
public class Question01 {
    public static void main(String[] args) {
        int applienceCode;
        double appliencePrice,discountRate;
        Appliance prdct1 = new Appliance(10001,1000);
        Appliance prdct2 = new Appliance(10002, 2000, 0.1);
        
    }
}
