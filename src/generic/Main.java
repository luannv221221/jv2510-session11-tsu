package generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo(1,1);
        Demo demo2 = new Demo(2,1);
        Demo2 demo3 = new Demo2("name","Nguyen Van A");


        DemoClassGeneric<Integer,Integer> demoClassGeneric = new DemoClassGeneric<>(1,2);
        DemoClassGeneric<Integer,String> demoClassGeneric2 = new DemoClassGeneric<>(1,"Nguyen Van A");
        DemoClassGeneric<String,String> demoClassGeneric1 = new DemoClassGeneric<>("name","Nguyen Van A");

        List<String>  stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        DemoClassGeneric.print(new Integer[]{1, 2, 4, 5, 5});
        DemoClassGeneric.print(new String[]{"A", "B", "C", "D", "E"});
    }
}
