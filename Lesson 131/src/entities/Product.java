package entities;

public class Product {

    protected String name;
    protected Double price;

    public Product(){}

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name + " - " + price + "€";
    }
}
