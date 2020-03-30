package day22;

public class StringArray {

    public static void main(String[] args) {

        String[] household = new String[3] ;

        household[0] = "Tamara " ;
        household[1] = "Googa " ;
        household[2] = "Chanel " ;

        System.out.println("My Household members are : "
                + household[0]
                + household[1]
                + household[2]
        );

        // immutable means you can not change the internal structure of the object
        // if you have String abc = "Hello"
        // if you do abc.toUppercase -->> it will create new String object "HELLO"
        // and it does not change original hello at all !!
        // not resizable --> specifically for array
        // we can not change the size of array once we create them with certain size
        // However , we can change the elements inside this array
        // and it means : IT IS NOT IMMUTABLE









    }
}
