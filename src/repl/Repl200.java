package repl;

public class Repl200 {
    public static void main(String[] args) {


    }

    public boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
        // public boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
        if(isAvailable==false && month==7 && day>=1 && day<=8 && year==2018){
            return true;
        }
        return false;
    }

    }

