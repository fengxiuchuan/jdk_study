package org.timer.thread.chapter01;

public class ComplexThread extends Thread {

    public ComplexThread(){
        System.out.println("ComplexThread start...");
        System.out.println("Thread.currentThread.getName()---->"+Thread.currentThread().getName());
        System.out.println("This.getName()---->"+this.getName());

        System.out.println("ComplexThread end...");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("run start...");
        System.out.println("Thread.currentThread.getName()---->"+Thread.currentThread().getName());
        System.out.println("This.getName()---->"+this.getName());

        System.out.println("run end...");

    }
}
