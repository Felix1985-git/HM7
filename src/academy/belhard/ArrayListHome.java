package academy.belhard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListHome {

    public static void main(String[] args) {
        Person person1 = new Person("Van", "Helsing", Gender.MALE);
        Person person2 = new Person("Mr", "Blade", Gender.MALE);
        Person person3 = new Person("Ms", "Buffy", Gender.FEMALE);
        Person person4 = new Person("Salomon", "Key", Gender.MALE);
        Person person5 = new Person("Blood", "Rayne", Gender.FEMALE);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        printCollection(persons);

        System.out.println("Items in the ArrayList collection: " + persons.size());
    }

    private static void printCollection(List<Person> persons) {
        for (Person person : persons) {
            System.out.print(person);
        }
        System.out.println();
    }
}
