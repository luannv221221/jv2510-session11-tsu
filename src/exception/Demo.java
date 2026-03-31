package exception;

import java.util.Scanner;

public class Demo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so chia ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao so bi chia");
        int m = Integer.parseInt(sc.nextLine());

        try{
            System.out.println("Ket qua = "+(m/m));
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } finally{
            System.out.println("gshajdgahsdgh");
        }

        System.out.println("Xong !!!!");
    }
}
