package day60;

import java.util.*;

public class CollectionIntro {
    public static void main(String[] args) {

        // List<String> names = new ArrayList<>();
        Collection<String> names = new ArrayList<>(Arrays.asList("Tamara", "Guga", "Masya", "Zuma", "Selya"));
        names.add("Hasan");
        names.add("Chanel");
        names.addAll(names);

        System.out.println("names = " + names);
        names.removeAll(Arrays.asList("Hasan","Zuma"));
        for (String eachNames :names) {
            System.out.println("eachNames = " + eachNames);

        }
        System.out.println("-----------------------");
        names.forEach(each-> System.out.println("each = " + each));
    }


       // System.out.println("first item = " + names.get(0));


    }

