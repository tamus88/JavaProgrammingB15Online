package repl;

public class Repl64 {

    public static void main(String[] args) {
      String word="ab";
     int charCount=word.length();
      if(charCount==1) {
          System.out.println(word + word + word);
      }else if(charCount==2){
          System.out.println(word + word);
      }else if(charCount>2){
     if(charCount%2==1) {
         System.out.println(word.charAt(charCount / 2));
     }else{
         int indexOfFirsthalf=charCount/2-1;
         int indexOfSecondhalf=charCount/2;
         System.out.println(word.charAt(indexOfFirsthalf)+""+word.charAt(indexOfSecondhalf));

     }
      }


    }

}
