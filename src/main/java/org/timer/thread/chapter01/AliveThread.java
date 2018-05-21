package org.timer.thread.chapter01;

public class AliveThread extends Thread{

    @Override
    public void run() {
        System.out.println("run方法中是否存活-->"+Thread.currentThread().isAlive());
    }
}
