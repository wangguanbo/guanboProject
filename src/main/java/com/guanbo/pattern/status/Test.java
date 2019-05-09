package com.guanbo.pattern.status;

public class Test {
    public static void main(String[] args) {
        ContextHandle contextHandle = new ContextHandle(new StatusA());
        contextHandle.request();;
        contextHandle.request();;
        contextHandle.request();;
        contextHandle.request();;
        contextHandle.request();;
    }
}
