package day64;

import java.util.*;

public class MapKeySetView_MapIteration {
    public static void main(String[] args) {

        Map<String,Double> groceryItems = new HashMap<>();
        groceryItems.put("Apple",1.99);
        groceryItems.put("Pears",2.99);
        groceryItems.put("Orange",2.50);
        groceryItems.put("Butter",3.50);
        groceryItems.put("Apple",1.99);
        groceryItems.put("Potato",1.50);
        groceryItems.put("Tomato",1.99);

        Collection<Double> allPrices = groceryItems.values();
        System.out.println("allPrices = " + allPrices);
        allPrices.removeAll(Arrays.asList(1.99));
        System.out.println("groceryItems = " + groceryItems);
        Set<String> allnames = groceryItems.keySet();
        for (String eachName : allnames) {
        System.out.print("eachName = " + eachName);
        System.out.println(" | value is = " + groceryItems.get(eachName));


        }

    }

}
