package patterns.structural.adapter.adapter.duckTurkeyEx.impl;

import patterns.structural.adapter.adapter.duckTurkeyEx.Duck;
import patterns.structural.adapter.adapter.duckTurkeyEx.Turkey;

public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
