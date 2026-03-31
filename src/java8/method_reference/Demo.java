package java8.method_reference;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        for (Integer integer : list) {
            System.out.println(integer);
        }
        list.forEach(i -> System.out.println(i));

        list.forEach(System.out::println);
    }
}
