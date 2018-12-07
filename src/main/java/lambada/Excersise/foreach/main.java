package lambada.Excersise.foreach;

import lambada.Excersise.java7.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("serja", "berber", 25),
                new Person("natalia", "berber", 28),
                new Person("anna", "berber", 40),
                new Person("dmitrii", "berber", 41),
                new Person("alena", "berber", 30));


        people.forEach(System.out::println);

        List list = new ArrayList();
        list.add(new Person("serja", "berber", 25));
        list.add(new Person("serjaaaaaa", "berber", 25));
        System.out.println(list.toString());
        list.remove(new Person("serjaaaaaa", "berber", 25));
        System.out.println(list.toString());
    }
}
