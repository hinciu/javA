package patterns.structural.adapter.adapter.duckTurkeyEx.impl;

import patterns.structural.adapter.adapter.duckTurkeyEx.Turkey;

public class SimpleTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("turkey gobble");
    }

    @Override
    public void fly() {
        System.out.println("turkey fly");
    }
}
