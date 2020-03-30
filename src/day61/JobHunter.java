package day61;

import java.util.*;

public class JobHunter {
    public static void main(String[] args) {


        Job j1 = new Job("Florida",120000,"Norwegian Cruise");
        Job j2 = new Job("Miami",130000,"Alaska Cruise");
        Job j3 = new Job("Georgia",125000,"Verizon");
        System.out.println(j1.compareTo(j2));

        List<Job> lst = new LinkedList<>();
        lst.add(new Job("Florida",120000,"Norwegian Cruise"));
        lst.add(new Job("Miami",130000,"Alaska Cruise"));
        lst.add(new Job("Georgia",125000,"Verizon"));
        System.out.println("Before sort lst = " + lst);
        Collections.sort(lst);
        System.out.println("After sort lst = " + lst);
        Collections.sort(lst, Comparator.reverseOrder());
        System.out.println("After reverse lst = " + lst);
    }

}
