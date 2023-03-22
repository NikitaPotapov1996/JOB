package Person;

import Person.Person;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Никита", 26);
        Person person2 = new Person();

        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
    }
}
