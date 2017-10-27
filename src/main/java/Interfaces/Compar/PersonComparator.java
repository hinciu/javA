package Interfaces.Compar;

import java.util.Comparator;

/**
 * Created by sberber on 8/5/2017.
 */
public class PersonComparator implements Comparator<Person> {
    public int compare(Person o1, Person o2) {
        if(o1.age > o2.age)
            return 1;
        else if (o1.age < o2.age)
            return -1;
        else return 0;


    }
}
