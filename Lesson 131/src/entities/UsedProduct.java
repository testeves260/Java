package entities;

import java.util.Date;

public class UsedProduct extends Product{

    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String priceTag(){
        return super.priceTag() + "(Manufacture Date: " + manufactureDate;
    }
}
