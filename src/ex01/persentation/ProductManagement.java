package ex01.persentation;

import ex01.business.ProductBusiness;

import java.util.Scanner;

public class ProductManagement {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("**********************QUẢN LÝ SẢN PHẨM*********************");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Danh sách sản phẩm");
            System.out.println("3. Sap xep san pham tang dan theo gia");
            System.out.println("4. Thoat");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    ProductBusiness.addProduct(input);
                    break;
                case 2:
                    ProductBusiness.displayProducts();
                    break;
                case 3:
                    ProductBusiness.sortProductByPriceASC();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("Sai lua chon");
            }
        } while (true);
    }
}
