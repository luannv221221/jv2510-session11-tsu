package java8;

public interface IDemo {
    default void show(){
        System.out.println("Demo Show");
    }
    static void show2(){
        System.out.println("Demo Show2");
    }
}
