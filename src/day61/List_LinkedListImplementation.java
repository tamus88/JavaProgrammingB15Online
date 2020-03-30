package day61;

import java.util.LinkedList;
import java.util.List;

public class List_LinkedListImplementation {
    public static void main(String[] args) {

        List<String> lst = new LinkedList<>();
        lst.add("Zeynap");
        lst.add("Kamila");
        lst.add("Sabina");
        lst.add("Hasan");
        System.out.println("lst = " + lst);
        lst.remove("Zeynap");
        System.out.println("lst = " + lst);

        LinkedList<String> ln = new LinkedList<>();

    }



}
