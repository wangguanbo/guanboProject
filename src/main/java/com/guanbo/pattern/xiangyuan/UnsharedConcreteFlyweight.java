package com.guanbo.pattern.xiangyuan;

public class UnsharedConcreteFlyweight extends Flyweight {

    public UnsharedConcreteFlyweight(String flag) {
        super(flag);
    }

    @Override
    public void option() {
        System.out.println("不共享的具体对象B");
    }
}
