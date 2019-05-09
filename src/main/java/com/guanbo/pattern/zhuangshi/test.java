package com.guanbo.pattern.zhuangshi;

public class test {
    public static void main(String[] args) {
        Pancake pancake = new TornCake();
        System.out.println(String.format("%s ￥%s",pancake.getDesc(),pancake.price()));

        Pancake roujiamo = new RouJiaMo();
        roujiamo = new FiredEgg(roujiamo);
        roujiamo = new FiredEgg(roujiamo);
        roujiamo = new Ham(roujiamo);
        System.out.println(String.format("%s ￥%s",roujiamo.getDesc(),roujiamo.price()));

    }
}
