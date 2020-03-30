package day49;

public class Tesla extends Vehicle implements Autonomus,Chargeable {

    String model;
    int horsePower;

    @Override
    public void selfDrive() {
        System.out.println("Tesla self driving");
    }

    @Override
    public void start() {
        System.out.println("Tesla model " + model + "start with electricity");
    }

    public Tesla(int year, String model, int horsePower) {
        super(year);
       this.model = model;
        this.horsePower = horsePower;
    }

    @Override
    public void goForward() {
        super.goForward();
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", year='" + year + '\'' +
                "} ";
    }
}
