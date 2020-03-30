package day63;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

        List<String> groupMember = new ArrayList<>(Arrays.asList("Abraham Hope","Zeliha Sezer","Tugba Bekar",
                "Seda Civan"));
        Map<String,Integer> allMap = new HashMap<>();
        for (String each :groupMember) {
            allMap.put(each,each.length());
        }
        System.out.println("allMap = " + allMap);
    }

}
