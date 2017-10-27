package Interfaces.Iterable;

import java.util.Iterator;


/**
 * Created by sberber on 8/6/2017.
 */
public class Person implements Iterable<String> {
    String name;
    String age;
    String lasName;
    String city;


    Person(String name, String age, String lastName, String city) {

        this.name = name;
        this.age = age;
        this.lasName = lastName;
        this.city = city;
    }


    public Iterator<String> iterator() {
        return new PersonIterator(this);
    }
}
