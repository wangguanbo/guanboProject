package com.guanbo.pattern.command;

public class CommandA extends Command {


    public CommandA(Receiver receiver) {
        super(receiver);
    }

    @Override
    protected void execute() {
        receiver.action();
    }
}
