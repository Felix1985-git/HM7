package academy.belhard;

import java.util.HashMap;
import java.util.Map;

public class HashMapHome {

    public static void main(String[] args) {
        Person person1 = new Person("Van", "Helsing", Gender.MALE);
        Person person2 = new Person("Mr", "Blade", Gender.MALE);
        Person person3 = new Person("Ms", "Buffy", Gender.FEMALE);
        Person person4 = new Person("Van", "Helsing", Gender.MALE);
        Person person5 = new Person("Mr", "Blade", Gender.MALE);

        Map<Integer, Person> persons = new HashMap<>();
        persons.put(1, person1);
        persons.put(2, person2);
        persons.put(3, person3);
        persons.put(4, person4);
        persons.put(5, person5);

        printCollection(persons);

        System.out.println("Items in the HashMap collection: " + persons.size());
    }

    private static void printCollection(Map<Integer, Person> persons) {
        for (Map.Entry entry : persons.entrySet()) {
            System.out.print(entry);
        }
        System.out.println();
    }
}
