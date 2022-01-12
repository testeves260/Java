package application;

import entities.Product;
import entities.UsedProduct;
import entities.ImportedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String [] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        List productList = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int productQty = sc.nextInt();

        for(int i = 0; i < productQty; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.println("Common, Used or Imported (c/u/i)?");
            char productType = sc.next().charAt(0);

            System.out.println("Name: ");
            String name = sc.next();

            System.out.println("Price:");
            sc.nextLine();
            Double price = sc.nextDouble();

            if (productType == 'i') {
                System.out.println("Customs fee: ");
                Double fee = sc.nextDouble();
                Product p = new ImportedProduct(name, price, fee);
                productList.add(p);

            } else if (productType == 'u') {
                System.out.println("What is the manufacture year date of this product?");
                int manufactureDate = sc.nextInt();
                Product p = new UsedProduct(name, price, manufactureDate);
                productList.add(p);
            } else {
                Product p = new Product(name, price);
                productList.add(p);
            }
        }

        System.out.println("PRICE TAGS:");
        for(int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i).toString());
        }
        
        sc.close();
    }
}
