package lambada.Excersise.streams;

import java.util.HashSet;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {
//        List<Person> people = Arrays.asList(
//                new Person("serja", "berber", 25),
//                new Person("natalia", "berber", 28),
//                new Person("anna", "berber", 40),
//                new Person("dmitrii", "berber", 41),
//                new Person("alena", "berber", 30));
//
//
//        people.stream()
//                .filter(person -> person.getFirstName().startsWith("a"))
//                .forEach(person -> System.out.println(person));
//
//        int a = (int) people.stream()
//                .filter(person -> person.getFirstName().startsWith("a"))
//                .count();
//        System.out.println(a);
//        IntStream.range(1, 4).forEach(System.out::println);
//
//        List list = new ArrayList();
//        List list2 = new ArrayList<Object>();
//        list.add("sdf");
//        list.add(7);
        TreeSet<Person3> set = new TreeSet<>();
        Person3 p1 = new Person3("Harry");
        Person3 p2 = new Person3("Shreya");
        Person3 p3 = new Person3("Selvan");
        Person3 p4 = new Person3("Shreya");
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        for (Person3 e : set) System.out.println(e);
        set.forEach(System.out::println);
    }

}
class Person3 {
    String name;
    Person3(String name) { this.name = name; }
    public String toString() { return name; }
}
