package repl;

public class Repl129 {
    public static void main(String[] args) {
//        System.out.println("-----EXAMPLE RUN ---------");
//        String[] numbers = {"zero", "one", "two", "three", "four"};
//        System.out.println(Arrays.toString(getWithE(numbers)));




  //  public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
        String[] fewValues = {"zero", "one", "two", "three", "four"};
        for (int x = 0; x < fewValues.length; x++) {
            if (fewValues[x].contains("e")) {
                System.out.print(fewValues[x]+" ");

            }
        }
    }
    }
