package com.guanbo.pattern.status;

public class StatusB extends Status {
    @Override
    public void handle(ContextHandle contextHandle) {
        contextHandle.setStatus(new StatusA());
    }
}
