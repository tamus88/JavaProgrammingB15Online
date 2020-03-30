package Practicing;

public class Dog extends Animal {

    String breed;
    int humanYears;

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(String name, int age, String breed){
       super(name,age);
    this.breed = breed;
    }

    @Override
    public void getAgeInHumanYears() {
        if (this.age <= 2) {
            System.out.println(this.age * 11);
        } else {
            System.out.println(humanYears == 22 + (this.age - 2) * 5);
        }
    }
        //    if the dog's age is less or equals to 2, multiple age by 11;
//    otherwise, human years is equals to: 22 + ((age-2) * 5);

    @Override
    public String toString() {
        return "Name: " + name +"\n" +
                "Breed: " + breed + "\n" +
                "Age in calendar years: " + age+"\n" +
                "Age in human years: " + humanYears;
    }
}

