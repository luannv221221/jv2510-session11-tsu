package ex01.entity;

import java.util.List;
import java.util.Scanner;

public class Product {
    private int productId;
    private String productName;
    private float price;
    private int quantity;
    private String category;

    public Product() {
    }

    public Product(int productId, String productName, float price, int quantity, String category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public void inputData(Scanner scanner, List<Product> productList) {
        // xu ly id tu tang
        if (productList.isEmpty()){
            this.productId = 1;
        } else {
            int maxProductId = productList.get(0).getProductId();
            for (Product product : productList) {
                if (product.getProductId() > maxProductId) {
                    maxProductId = product.getProductId();
                }
            }
            this.productId = maxProductId + 1;
        }
        this.productName = inputProductName(scanner, productList);

        this.price = inputProductPrice(scanner);
        System.out.println("So luong san pham ");
        this.quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao danh muc san pham");
        this.category = scanner.nextLine();

    }
    // phuong thuc nhap productName
    public String inputProductName(Scanner scanner, List<Product> productList) {
        do {
            System.out.println("Nhap vao ten san pham ");
            String productName = scanner.nextLine();
            if(productName.length() >= 10 && productName.length() <= 60){
                boolean checknameIsExist = false;
                for (Product product : productList) {
                    if (product.getProductName().equals(productName)) {
                        checknameIsExist = true;
                    }
                }
                if (!checknameIsExist) {
                    return  productName;
                }
                System.err.println("Ten san pham da ton tai");
            } else {
                System.err.println("Do dai khong hop le");
            }
        } while (true);
    }
    // phuo=ng thuc nhap gia san pham
    public float inputProductPrice(Scanner scanner) {
        System.out.println("Nhap vao gia san pham ");
        do {
            try {
                float productPrice = Float.parseFloat(scanner.nextLine());
                if(productPrice > 0){
                    return productPrice;
                }
                System.err.println(" Gia phai lon hon 0");
            } catch (NumberFormatException e) {
                System.err.println(" Gia phai nhap dinh dang so");
            }
        } while (true);
    }
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                '}';
    }
}
