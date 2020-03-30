package homeWork;

public class ArrayHomeWork {
    public static void main(String[] args) {

        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};

        for (String eachFruit : groceryItems) {

            System.out.print(eachFruit);
            System.out.print(" -->  ");

        }
        System.out.println();

        int itemCount = groceryItems.length;
        int lastItemIndex = itemCount - 1;
        String lastFruit = groceryItems[lastItemIndex];  // groceryItems[groceryItems.length-1]

        for (String eachFruit : groceryItems) {

            System.out.print(eachFruit);
            // only print arrow when the fruit is not last item
            if (!eachFruit.equals(lastFruit)) {
                System.out.print(" -->  ");

            }
        }
    }
    }