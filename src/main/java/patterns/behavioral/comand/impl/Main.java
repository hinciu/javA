package patterns.behavioral.comand.impl;

public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightsOfCommand lightsOfCommand = new LightsOfCommand(light);
        remoteControl.setCommand(0, lightOnCommand,lightsOfCommand);
        remoteControl.onButtonWasPushed(0);
        remoteControl.ofButtonWasPushed(0);
    }
}
