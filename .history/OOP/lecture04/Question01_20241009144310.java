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

    public void setSaleDiscount(double Rate){
        this.discountRate = Rate;
    }
    public double calculateSaleDiscount(){
        appliencePrice * discountRate;
        return;
    }
    public int getapplienceCode(){
        return applienceCode;
    }
    public double 

}
public class Question01 {
    public static void main(String[] args) {
        int applienceCode;
        double appliencePrice,discountRate,dicountAmount;
        Appliance prdct1 = new Appliance(10001,1000);
        Appliance prdct2 = new Appliance(10002, 2000, 0.1)
        dicountAmount = prdct1.calculateSaleDiscount();
        System.out.print("Applience Code - " + getapplienceCode());
        System.out.println("Discount Amount - " + dicountAmount);
    }
}
