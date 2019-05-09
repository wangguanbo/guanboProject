package com.guanbo.pattern.zhuangshi;

public abstract class Pancake {

    public String desc = "抽象饼";

    public String getDesc() {
        return desc;
    }

    public abstract double price();
}
