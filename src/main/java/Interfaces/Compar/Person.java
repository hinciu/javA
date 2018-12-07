package Interfaces.Compar;


/**
 * Created by sberber on 8/5/2017.
 */
public class Person implements Comparable<Person>{
    int age;
    String name;

    Person(int age, String name){
        this.age = age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Person o) {
        if(this.age < o.age)
            return 1;
        else if (this.age > o.age)
            return -1;
        else return 0;
    }
}
