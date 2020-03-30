package repl;

public class Repl204 {
    public static void main(String[] args) {


        System.out.println(isAnagram("Star","rats"));
        System.out.println(isAnagram("Hi","Bye"));
        System.out.println(isAnagram("Java","Cava"));
    }
    public static boolean isAnagram(String word1, String word2) {

        for (int i = 0; i < word1.length(); i++) {
            for(int j = 0; j <word2.length(); j++){
                if(word1.contains("i")== word2.contains("j")){
                        return true;
                    }
            }
        }
        return false;
    }


}