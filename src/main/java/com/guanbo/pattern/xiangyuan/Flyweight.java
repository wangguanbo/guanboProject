package com.guanbo.pattern.xiangyuan;

public abstract class Flyweight {

    public String flag;

    public abstract void option();

    public Flyweight(String flag) {
        this.flag = flag;
    }
}
