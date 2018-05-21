package org.timer.thread.chapter01;


public class ExampleThread extends Thread {
    @Override
    public void run() {
        System.out.println("this is extend thread ");
        System.out.println("当前线程的id是--->"+ Thread.currentThread().getId());
        System.out.println("当前线程的名字是--->"+Thread.currentThread().getName());
        System.out.println("run 方法中thread是否存活  " + Thread.currentThread().isAlive());
    }
}
