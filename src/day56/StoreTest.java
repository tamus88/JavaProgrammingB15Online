package day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest {
    public static void main(String[] args) {

        Store s1 = new Store();
        System.out.println(s1.name);
        System.out.println(s1.allProducts);
        System.out.println("s1 = " + s1);

        s1.allProducts.add(new Product("imac", 3999));
        System.out.println(s1.allProducts);

        List<Product> denisList = Arrays.asList(new Product("cookie", 2),
                new Product("tea", 3),
                new Product("coffee", 7),
                new Product("muffins", 5));

        Store s2 = new Store("Denis Store", denisList);

        System.out.println("s2 = " + s2);
        Product p1 = new Product("Ice Cream",7.99);
        s2.addProduct(p1);
        System.out.println("s2 = " + s2);
        s2.addProduct("CheeseCake",5);
        System.out.println("s2 = " + s2);
        System.out.println(s2.getProductCount());
        s2.displayProducts();
        System.out.println(s2.checkIfProductExist(p1));
        System.out.println(s2.indexOfProduct(p1));
        System.out.println(s2.maxPrice());
    }


}
