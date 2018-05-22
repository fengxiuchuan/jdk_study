package org.timer.thread.chapter01;

import org.junit.Test;

public class DaemonThreadTest{

    @Test
    public void testRun(){
        DaemonThread thread = new DaemonThread();
        thread.setName("time");
        thread.setDaemon(true);
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("执行完，不再执行了");
    }

}
