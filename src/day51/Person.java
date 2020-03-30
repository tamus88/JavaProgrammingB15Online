package day51;

public class Person implements Comparable<Person>{

String name;
int age;

public Person(String name, int age){
    this.name = name;
    this.age = age;

}
//    public int compareTo(Person anotherPerson) {
//        if (this.age > anotherPerson.age) {
//            return 1;
//        } else if (this.age < anotherPerson.age) {
//            return -1;
//        } else {
//            return 0;
//        }
//}
    public int compareTo(Person anotherPerson) {
//        if (this.name.charAt(0) > anotherPerson.name.charAt(0)) {
//            return 1;
//        } else if(this.name.charAt(0) < anotherPerson.name.charAt(0)) {
//            return -1;
//        }else{
//           return 0;
//        }
    return this.name.compareTo(anotherPerson.name);

}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
