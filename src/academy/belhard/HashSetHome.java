package academy.belhard;

import java.util.HashSet;
import java.util.Set;

public class HashSetHome {

    public static void main(String[] args) {
        Person person1 = new Person("Van", "Helsing", Gender.MALE);
        Person person2 = new Person("Mr", "Blade", Gender.MALE);
        Person person3 = new Person("Ms", "Buffy", Gender.FEMALE);
        Person person4 = new Person("Van", "Helsing", Gender.MALE);
        Person person5 = new Person("Mr", "Blade", Gender.MALE);

        Set<Person> persons = new HashSet<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        printCollection(persons);

        System.out.println("Items in the HashSet collection: " + persons.size());
    }

    private static void printCollection(Set<Person> persons) {
        for (Person person : persons) {
            System.out.print(person);
        }
        System.out.println();
    }
}
