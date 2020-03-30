package day49;

public abstract class Vehicle {

int year;

    public Vehicle(int year) {
        this.year = year;
    }


    public void selfDrive() {
        System.out.println("Vehicle is self drive");
    }

    public abstract void start();

    public void goForward(){
        System.out.println("Vehicle going forward");
    }
}
