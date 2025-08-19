import java.util.*;
public class intro_list {
    public static void main(String[] args) {
        List <Integer> book = new ArrayList<>();
        book.add(10);
        book.add(20);
        book.add(30);
        book.add(40);
        book.add(50);
        book.add(60);
        book.add(70);
        book.add(80);
        book.add(90);
        book.add(100);
        System.out.println("Printing all the elements : "+ book);
        book.remove(0);
        System.out.println("Printing elements after removing the Index 0 : "+ book);
        System.out.println("Size of thr list : "+ book.size());
        book.remove(book.size()-1);// Removing the last element
        System.out.println("after removing the last element from the list : "+ book);
    }
}