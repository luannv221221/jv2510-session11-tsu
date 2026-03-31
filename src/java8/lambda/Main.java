package java8.lambda;

public class Main {
    public static void main(String[] args) {
        IFunctionalInterface iFunctionalInterface = new IFunctionalInterface() {
            @Override
            public int sum(int first, int second) {
                return first + second;
            }
        };

        // dung bieu thuc lambda
        IFunctionalInterface iFunctionalInterface1 = (int first, int second) -> first + second;
        IFunctionalInterface iFunctionalInterface2 = (int first, int second) -> { return first + second;};
    }
}
