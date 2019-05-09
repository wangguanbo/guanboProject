package com.guanbo.pattern.status;

public class ContextHandle {

    private Status status;


    public ContextHandle(Status status) {
        this.status = status;
    }

    public void request(){
        status.handle(this);
        System.out.println("状态现在是"+getStatus()+"");
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

}
