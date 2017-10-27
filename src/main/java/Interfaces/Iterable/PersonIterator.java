package Interfaces.Iterable;

import java.lang.reflect.Field;
import java.util.Iterator;

/**
 * Created by sberber on 8/7/2017.
 */
public class PersonIterator implements Iterator<String> {
    Person person;

    PersonIterator(Person person) {
        this.person = person;
    }

    Field[] l = Person.class.getDeclaredFields();
    private int index = 0;

    public boolean hasNext() {

        if ((l.length - index) > 0) {
            return true;
        } else
            return false;
    }

    public String next() {
//        String rez = l[index].getName();
//        index++;
//        return rez;
        String rez = null;
        Field field = l[index];
        field.setAccessible(true);
        try {
            rez = (String) field.get(person);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        index++;
        return rez;
    }
    public void remove() {

    }
}
