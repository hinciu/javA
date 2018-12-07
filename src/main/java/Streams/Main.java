package Streams;

import Streams.asdasd.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Class1> list = new ArrayList<Class1>();
        List<Integer> list2 = new ArrayList<>();

        Class1 class1 = new Class1(1);
        Class1 class2 = new Class1(2);
        Class1 class3 = new Class1(3);
        Class1 class4 = new Class1(4);
        list.add(class1);
        list.add(class2);
        list.add(class3);
        list.add(class4);
        list2 = list.stream().map(s -> s.show()).collect(Collectors.toList());
        System.out.println(list2);



    }
}
