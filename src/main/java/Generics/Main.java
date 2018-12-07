package Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
//        Human human =  Human.class.newInstance();

        ArrayList<?> list = new ArrayList<Girl>();
    }
}
