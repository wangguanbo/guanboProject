package com.guanbo.pattern.command;

/**
 * 命令模式是消息发送者 invoker 和 receiver 的一个解耦
 */
public class Test {
    public static void main(String[] args) {
        Receiver r = new Receiver();
        Invoker invoker = new Invoker();
        invoker.setCommand(new CommandA(r));
        invoker.executeComand();
    }
}
