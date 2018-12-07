package lambada.Excersise.java8;

import lambada.Excersise.java7.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("serja", "berber", 25),
                new Person("natalia", "berber", 28),
                new Person("anna", "berber", 40),
                new Person("dmitrii", "berber", 41),
                new Person("alena", "berber", 30));


        //Step 1: Sort list by last name

        Collections.sort(people, (p1, p2) -> {return 0;});

        // Step 2: Create method that prints all all elements in the list

        printAll(people);
        printConditionally(people, p -> true);

        // Step 3: Create a method that print all people tha have last name beginning with particular letter
        printConditionally(people, p -> p.getFirstName().startsWith("a"));
        performConditionally(people, p -> p.getFirstName().startsWith("a"), p -> System.out.println(p.getAge()));


    }

    private static void printAll(List<Person> list) {
        for (Person p : list) {
            System.out.println(p);
        }
    }

    private static void printConditionally(List<Person> list, Predicate<Person> cond) {
        for (Person p : list) {
            if (cond.test(p))
                System.out.println(p);
        }
    }

    private static void performConditionally(List<Person> list, Predicate<Person> cond, Consumer<Person> consumer) {
        for (Person p : list) {
            if (cond.test(p))
                consumer.accept(p);
        }
    }

}



