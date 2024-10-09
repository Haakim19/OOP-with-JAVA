class Appliance{
    private int applienceCode;
    private double appliencePrice,discountRate;

    
    public Applience(int apCode,double apPrice){
        this.applienceCode = apCode;
        this.appliencePrice = apPrice;
    }
    
    public void setSaleDiscount(double Rate){
        this.discountRate = Rate;
    }
    public void calculateSaleDiscount(){

    }
    public int getapplienceCode(){
        return applienceCode;
    }
    public double 

}
public class Question01 {
    public static void main(String[] args) {
        int applienceCode;
        double appliencePrice,discountRate;
        Appliance prdct1 = new Appliance();
        prdct1.setInputData(10010,10000);
        prdct1.setSaleDiscount(0.1);
    }
}
