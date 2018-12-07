package patterns.structural.adapter.adapter.duckTurkeyEx.impl;

import patterns.structural.adapter.adapter.duckTurkeyEx.Duck;

public class SimpleDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("duck quack");
    }

    @Override
    public void fly() {
        System.out.println("duck fly");
    }
}
