package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by sberber on 9/23/2017.
 */
public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("sharik");
        Dog d2 = new Dog("sharik");
        Dog d3 = new Dog("sharik");

        List<Dog> list = Arrays.asList(d1,d2);

        System.out.println(list.contains(d3));
        System.out.println(Arrays.toString(list.toArray()));

    }
}

class Dog{
    String name;

    Dog(String string){
        this.name = string;
    }
}
