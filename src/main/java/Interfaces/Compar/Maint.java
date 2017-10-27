package Interfaces.Compar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by sberber on 8/5/2017.
 */
public class Maint {
    public static void main(String[] args) {
        Person p1= new Person(45,"Petr");
        Person p2= new Person(55,"Alex ");
        Person p3= new Person(13,"Serghei");
        Person p4= new Person(78,"Dmitrii");
        ArrayList<Person> list = new ArrayList<Person>();


        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        PersonComparator pc = new PersonComparator();
        Collections.sort(list,pc);
        //Collections.sort(list);
        System.out.println(Arrays.toString(list.toArray()));

        for (Person p : list){
            System.out.println(p);
        }
        Integer a = 100;
    }
}
