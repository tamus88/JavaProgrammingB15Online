package repl;

public class Repl160 {
    public static void main(String[] args) {
String[] words = {"java", "code", "python", "code", "rust", "code", "rust"};
       // System.out.println((printUniqueWords(words));
    }


    public static void printUniqueWords(String[] words) {
        //WRITE YOUR CODE HERE
        String name = "";
        for (int i = 0; i < words.length; i++) {


            for (int x = 0; x < words.length; x++) {
                int count = 0;
                if (words.equals(i) != words.equals(x)) {
                    count++;
                }
                if (count == 1) {
                    name += count;
            }

                System.out.println(name);
            }
        }
    }
}


