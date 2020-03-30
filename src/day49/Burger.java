package day49;

public class Burger implements Edible, Juicy {

    public Burger(){
        super();
    }
    @Override
    public void melt(){
        System.out.println("Juice burger is melting");
    }

    @Override
    public void eat() {
        System.out.println("Eating burger with big bite");
    }

    @Override
    public void drink() {
        System.out.println("Eat burger than drink soda");
    }


}
