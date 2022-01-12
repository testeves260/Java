package entities;

import java.util.Date;

public class UsedProduct extends Product{

    private int manufactureDate;

    public UsedProduct(String name, Double price, int manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String toString(){
        return super.toString() + " (Manufacture Date: " + manufactureDate + ")";
    }
}
