package generic;

import java.util.Arrays;
import java.util.List;

public class DemoClassGeneric <K,V>{
    private K key;
    private V value;
    public DemoClassGeneric(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    // phuong thuc generic
    public static <T> void print(T[] array){
        for (T element : array) {
            System.out.println(element);
        }
    }

    public List<?> demoWildcard(){
        return Arrays.asList(new Integer[]{1, 2, 4, 5, 5});
    }
}
