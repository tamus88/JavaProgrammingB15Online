package homeWork;

public class ReplPractice {
    public static void main(String[] args) {

        System.out.println(RemoveDuplicate("aabbccde"));
    }

    public static String RemoveDuplicate(String str) {

        String result = "";

        for (int x = 0; x < str.length(); x++) {
           if(!result.contains(str.substring(x, x+1))){
             result+= str.substring(x, x+1);
           }
        }
        return result;
    }
    public static String UniqueValue(String str){

        String result = "";
        for (int j = 0; j < str.length(); j++) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(j)) {
                count++;
            }
        }
        if(count==1){
            result+= str.charAt(j);
        }

        }
        return result;
    }

}