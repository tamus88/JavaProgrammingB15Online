package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetUniqueStates_Deleting {
    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        // all Collection type has addAll method
        states.addAll(Arrays.asList("GA", "NY", "FL", "CA", "NY", "WA", "VA", "VA", "FL"));
        System.out.println("states before = " + states);
//        states.remove("GA");
//        System.out.println("states after  = " + states);
        states.removeIf(each->each.contains("A"));
        System.out.println("states after = " + states);
//      remove all the states with letter A
        Iterator<String> stIter = states.iterator();
        // Iterator has 3 methods hasNext() next() remove() works together
        // to remove item while iterating over a collection
//        while (stIter.hasNext() ){
////
////            String each = stIter.next();
////            if(each.contains("A") ){
////                System.out.println("removing = " + each);
////                stIter.remove();
////            }
////
////        }

        while (stIter.hasNext()) {

            // PLEASE DO NOT CALL NEXT METHOD TWICE IN ONE ITERATION OR IT WILL SKIP TO NEXT ITEM
            if (stIter.next().contains("A")) {
//                System.out.println("removing = " + stIter.next());
                stIter.remove();
            }
        }
        System.out.println("states after   = " + states);

    }

}

