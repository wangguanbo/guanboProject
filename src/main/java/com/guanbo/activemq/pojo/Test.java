package com.guanbo.activemq.pojo;

public class Test {

    private static Boolean flag = false;

    private static int num = 0 ;

    public static class ReaderThread implements Runnable{

        @Override
        public void run() {
            while (!flag){
                Thread.yield();
                System.out.println(num);
            }
        }

    }

    public static void main(String[] args) {
        new Thread(new ReaderThread()).start();
        flag = false;
        num = 24;
    }
}
