package day49;

public interface Edible {
    //in interface fields are automatically static final
    public static final boolean IS_HUMANFOOD  = true;

   public abstract void eat();
   public abstract void drink();

    public default void digest(){
        System.out.println("You implement the code yourself");
    }

}
