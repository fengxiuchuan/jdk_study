package org.timer.thread.chapter01;

public class ExampleCurrentThread extends Thread {

    public ExampleCurrentThread(){
        System.out.println("构造方法打印--->"+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        super.run();
        System.out.println("run方法打印--->"+Thread.currentThread().getName());
    }
}
