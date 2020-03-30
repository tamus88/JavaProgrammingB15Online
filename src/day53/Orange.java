package day53;
public class Orange extends Fruit {

   int vitC;

    public Orange(String taste, String color,int vitC) {
        super(taste, color);
    this.vitC = vitC;

    }

    @Override
    public void getDigest() {
        System.out.println(" Orange with Vitamin C level " + vitC + " has color " + color + " and it has " +
                taste + " taste when you digest");
    }

    @Override
    public String toString() {
        return "Orange{" +
                "vitC=" + vitC +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                "} ";
    }
}
