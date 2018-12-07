package patterns.structural.adapter.adapter.duckTurkeyEx;

import patterns.structural.adapter.adapter.duckTurkeyEx.impl.SimpleDuck;
import patterns.structural.adapter.adapter.duckTurkeyEx.impl.SimpleTurkey;
import patterns.structural.adapter.adapter.duckTurkeyEx.impl.TurkeyAdapter;

public class Main {
    public static void main(String[] args) {
        SimpleDuck duck = new SimpleDuck();
        SimpleTurkey turkey = new SimpleTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        testDuck(duck);
        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
