package day53;

import java.util.Arrays;
import java.util.List;

public class FruitShop {

    public static void main(String[] args) {

        Apple a1 = new Apple("sweet","red","Fuji");
        Fruit f1 = a1;
        Fruit f2 = new Apple("crispy","hot red","Gala");
        Fruit f3 = new Orange("sour","orange",12);
        Fruit f4 = new Orange("very sweet","Blood red",10);
        a1.getDigest();
        f1.getDigest();
        f3.getDigest();

        //Fruit[] myFruits = {f1,f2,f3,f4};
        List<Fruit> lst= Arrays.asList(f1,f2,f3,f4);
        for (Fruit each :lst) {
            each.getDigest();
        }

    }


}
