package Q1;
public class Vehicle extends TaxableItem {
    private double dealerCost;
    private double dealerMarkup;

    public Vehicle(double dealerCost, double dealerMarkup, double taxRate) {
        super(taxRate);
        this.dealerCost = dealerCost;
        this.dealerMarkup = dealerMarkup;
    }

    @Override
    public double getListPrice() {
        return dealerCost + dealerMarkup;
    }

}
