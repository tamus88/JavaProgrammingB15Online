package day49;

public class IceCream implements Edible {


    public IceCream() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Eat with spoon");
    }

    @Override
    public void drink() {
        System.out.println("drink it if it has melted in the cup");
    }

    public static void main(String[] args) {

        IceCream i1 = new IceCream();
        i1.drink();
        i1.eat();
        Burger b1 = new Burger();
        b1.drink();
        b1.digest();
    }

}
