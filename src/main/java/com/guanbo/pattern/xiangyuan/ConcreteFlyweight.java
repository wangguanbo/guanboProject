package com.guanbo.pattern.xiangyuan;

public class ConcreteFlyweight extends Flyweight {

    public ConcreteFlyweight(String flag) {
        super(flag);
    }

    @Override
    public void option() {
        System.out.println("共享的具体实现A,flag=="+flag);
    }
}
