package com.guanbo.pattern.command;

public class Invoker {

    private Command command;

        public void setCommand(Command command) {
            this.command = command;
        }

    public void executeComand(){
        command.execute();
    }
}
