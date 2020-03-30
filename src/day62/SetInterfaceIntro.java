package day62;

import java.util.*;

public class SetInterfaceIntro {
    public static void main(String[] args) {


        Set<Integer> myNums = new HashSet<>();
        myNums.add(10);
        myNums.add(20);
        myNums.add(30);
        myNums.add(95);
        myNums.add(10);
        System.out.println("myNums = " + myNums);

       Set<String> states = new HashSet<>(Arrays.asList("Chicago","Florida","NY","California","Chicago",
               "Nevada","NY","Ohio"));
        System.out.println("states = " + states);
        for (String each :states) {
            System.out.println("each = " + each);
        }
        List<String> mylst = new ArrayList<>(states);
        Collections.sort(mylst);
       // mylst.sort(Comparator.reverseOrder());
        System.out.println("mylst = " + mylst);

//        states.remove("NY");
//        System.out.println("states = " + states);


        }
    }




