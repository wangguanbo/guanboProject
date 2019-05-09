package com.guanbo.pattern.status;

public class StatusA extends Status {
    @Override
    public void handle(ContextHandle contextHandle) {
        contextHandle.setStatus(new StatusB());
    }
}
