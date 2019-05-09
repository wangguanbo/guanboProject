package com.guanbo.pattern.xiangyuan;

import java.util.HashMap;

public class FlyweightFactory {

    private FlyweightFactory() {

    }

    private static HashMap<String,Flyweight> hashMap = new HashMap<>();

    public static Flyweight getFlyweghtByFlag(String flag){
        if(!hashMap.containsKey(flag)){
            hashMap.put(flag,new ConcreteFlyweight(flag));
        }
        return hashMap.get(flag);
    }

    public static int getFLyweight(){
        return hashMap.size();
    }

    public static HashMap getHashMap(){
        return hashMap;
    }
}
