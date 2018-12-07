package lambada.Excersise.java7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Condition;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("serja", "berber", 25),
                new Person("natalia", "berber", 28),
                new Person("anna", "berber", 40),
                new Person("dmitrii", "berber", 41),
                new Person("alena", "berber", 30));


        //Step 1: Sort list by last name

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        // Step 2: Create method that prints all all elements in the list

        printAll(people);

        // Step 3: Create a method that print all people tha have last name beginning with particular letter
        printConditionally(people, new Cond() {
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("C");
            }
        });

    }

    private static void printAll(List<Person> list) {
        for (Person p : list) {
            System.out.println(p);
        }
    }

    static void printConditionally(List<Person> list, Cond condition) {
        for (Person p : list) {
            if (condition.test(p))
                System.out.println(p);
        }
    }

}

interface Cond {
    boolean test(Person p);
}
