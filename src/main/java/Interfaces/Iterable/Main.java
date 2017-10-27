package Interfaces.Iterable;

/**
 * Created by sberber on 8/6/2017.
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Person("PETR","45","Ivanov", "Chis");
        Person p3 = new Person("PETR","45","Ivanov", "Chis");

        Person.class.getName();

        for (String p1: p) {
            System.out.println(p1);
        }
    }
}
