package lambada.Excersise.methodReferences;

import lambada.Excersise.java7.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class methodRefEx2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("serja", "berber", 25),
                new Person("natalia", "berber", 28),
                new Person("anna", "berber", 40),
                new Person("dmitrii", "berber", 41),
                new Person("alena", "berber", 30));




        Collections.sort(people, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));



        performConditionally(people, p -> true, System.out::println);


    }


    private static void performConditionally(List<Person> list, Predicate<Person> cond, Consumer<Person> consumer) {
        for (Person p : list) {
            if (cond.test(p))
                consumer.accept(p);
        }
    }
}

