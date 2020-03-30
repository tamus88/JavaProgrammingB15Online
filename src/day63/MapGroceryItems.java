package day63;

import java.util.HashMap;
import java.util.Map;

public class MapGroceryItems {
    public static void main(String[] args) {

        Map<String,Double> groceryItems = new HashMap<>();
        groceryItems.put("Apple",1.99);
        groceryItems.put("Pears",2.99);
        groceryItems.put("Orange",2.50);
        groceryItems.put("Butter",3.50);
        groceryItems.put("Apple",1.99);
        groceryItems.put("Potato",1.50);
        groceryItems.put("Tomato",1.99);
        groceryItems.putIfAbsent("Onion",1.50);
        System.out.println("groceryItems.size() = " + groceryItems.size());
        System.out.println("groceryItems = " + groceryItems);
        groceryItems.get("Orange");
        groceryItems.replace("Apple",1.99,1.99*2);
        groceryItems.replace("Onion",1.50,1.50*2);
        groceryItems.replace("Apple",groceryItems.get("Apple")*2);
        groceryItems.remove("Tomato");
        System.out.println("groceryItems = " + groceryItems);
    }

}
