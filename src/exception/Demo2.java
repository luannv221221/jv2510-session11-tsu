package exception;

public class Demo2 {
    public void div(int a,int b) throws ArithmeticException {
        if (b==0){
            throw new ArithmeticException("Khong the chia cho so 0");
        }
    }
}
