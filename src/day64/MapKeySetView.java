package day64;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapKeySetView {
    public static void main(String[] args) {

        Map<String,Double> groceryItems = new HashMap<>();
        groceryItems.put("Apple",1.99);
        groceryItems.put("Pears",2.99);
        groceryItems.put("Orange",2.50);
        groceryItems.put("Butter",3.50);
        groceryItems.put("Apple",1.99);
        groceryItems.put("Potato",1.50);
        groceryItems.put("Tomato",1.99);
        System.out.println(groceryItems.keySet());
        Set<String> allNames = groceryItems.keySet();
        System.out.println("allNames = " + allNames);
        allNames.remove("Tomato");
        System.out.println("No Tomato = " + allNames);
        System.out.println("groceryItems = " + groceryItems);

        Set<String> namesCopy = new HashSet<>(allNames);
        namesCopy.remove("Tomato");
        System.out.println("namesCopy = " + namesCopy);
        System.out.println("groceryItems = " + groceryItems);
    }
}
