package patterns.behavioral.comand.impl;

import patterns.behavioral.comand.Command;

public class LightsOfCommand implements Command {

    Light light;

    public LightsOfCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.of();
    }
}
