package patterns.behavioral.comand.impl;

import patterns.behavioral.comand.Command;
//invoker
public class SimpleRemoteControl {
    Command slot;
    Command[] onCommands;
    Command[] offCommands;

    public SimpleRemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
    }


    public void setCommand(int slot, Command onCommand, Command ofCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = ofCommand;
    }

    public void onButtonWasPushed(int slot) {
        if (onCommands[slot] !=  null) {
            onCommands[slot].execute();
        }
    }

    public void ofButtonWasPushed(int slot) {
        if (onCommands[slot] !=  null) {
            offCommands[slot].execute();
        }
    }

}
