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
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List productList = new ArrayList<>();


        System.out.println("Enter the number of products: ");
        int productQty = sc.nextInt();

        for(int i = 0; i < productQty; i++){
            System.out.println("Product #" + i + " data:");
            System.out.println("Common, used or imported (c/u/i)?");
            char productType = sc.next().charAt(0);

            System.out.println("Name: ");
            String name = sc.next();

            System.out.println("Price");
            Double price = sc.nextDouble();

            System.out.println("");

            if(productType == 'i'){

                System.out.println("Customs fee: ");
                Double fee = sc.nextDouble();
                Product p = new ImportedProduct(name, price, fee);
                productList.add(p);

            } else if(productType == 'u'){

                System.out.println("What is the manufacture Date of this product?");
                Date manufactureDate = sdf.parse(sc.next());
                Product p = new UsedProduct(name, price, manufactureDate);
                productList.add(p);

            } else {

                Product p = new Product(name, price);
                productList.add(p);

            }
        }
    }
}
