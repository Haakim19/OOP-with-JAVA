package question;
class CorporateCustomer extends customer{
    public double calculate(double purchaseAmount){
        double total = purchaseAmount - (purchaseAmount/10);
        return total;
    };
}
