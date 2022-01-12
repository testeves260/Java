package entities;

public class ImportedProduct extends Product {

    private Double customsFee;
    private Double depotTax = 20.00;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return price+20;
    }

    public String toString(){
        return super.toString() + " (Customs fee: $" + depotTax + ")";
    }

}
