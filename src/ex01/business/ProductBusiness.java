package ex01.business;

import ex01.entity.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductBusiness {
    private static List<Product> products = new ArrayList<>();

    public static void addProduct(Scanner scanner){
        Product product = new Product();
        product.inputData(scanner,products);
        products.add(product);
    }

    public static void displayProducts(){
        for(Product product:products){
            System.out.println(product.toString());
        }
    }

    public static void sortProductByPriceASC(){
        products.stream().sorted(Comparator.comparing(Product::getPrice)).forEach(product ->  System.out.println(product.toString()));
    }
}
