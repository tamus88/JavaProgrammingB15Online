package day60;

public class BreakTimeException extends RuntimeException {



}
class Main{
    public static void main(String[] args) {

      //  throw new BreakTimeException();
        try {
            throw new  MyOwnCheckedException();
        } catch (MyOwnCheckedException e) {
            System.out.println("Woala My own thing caught");
        }
    }
}