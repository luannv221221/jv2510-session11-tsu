package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Kieu A",100);
        Book book1 = new Book("Kieu F",50);
        Book book2 = new Book("Kieu D",60);
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(book);
        bookList.add(book1);
        bookList.add(book2);

        System.out.println("Chua sap xep");
        for(Book b : bookList){
            System.out.println(b.getName());
        }

        System.out.println("Sắp xép theo gia tằng dần");
        bookList.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int) (o1.getPrice() - (o2.getPrice()));
            }
        });

        for(Book b : bookList){
            System.out.println(b.getName());
        }

        System.out.println("Sắp xép theo ten tằng dần");
//        bookList.sort(new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        bookList.sort((o1,o2)->o1.getName().compareTo(o2.getName()));
        for(Book b : bookList){
            System.out.println(b.getName());
        }
    }
}
