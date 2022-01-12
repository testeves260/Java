package entities;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return price+customsFee;
    }

    @Override
    public String toString(){
        return name + " - " + totalPrice() + "€ (Customs fee: " + customsFee + "€)";
    }

}
