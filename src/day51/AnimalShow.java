package day51;

public class AnimalShow {

    public static void main(String[] args) {

//        Dog d1 = new Dog();

            // we are referring Dog object using Animal reference

            Animal a1 = new Dog();
            a1.makeNoise();

            a1 = new Horse();
            a1.makeNoise();
           Animal a2 = new Horse();
            a2.makeNoise();
        }


    }