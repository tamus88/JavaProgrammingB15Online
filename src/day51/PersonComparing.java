package day51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonComparing {
    public static void main(String[] args) {

        Person p1 = new Person("Tamara",31);
        Person p2 = new Person("Guvanch",28);
        Person p3 = new Person("Malika",27);
        System.out.println(p3.compareTo(p1));
        System.out.println(p1.compareTo(p2));

        int result = p2.compareTo(new Person("Zumrat",30));
        System.out.println(result);
        //        if(p1.age>p2.age){
//            System.out.println(1);
//        }else if(p1.age<p2.age){
//            System.out.println(-1);
//        }else{
//            System.out.println(0);
//        }

        List<Person> lst = new ArrayList<>(Arrays.asList(p1,p2,p3));
        lst.add(new Person("John Snow",26));
        System.out.println("lst = " + lst);
       // Anything we sort must be a type of COMPARABLE
        Collections.sort(lst);
        System.out.println("lst = " + lst);
    }




}
