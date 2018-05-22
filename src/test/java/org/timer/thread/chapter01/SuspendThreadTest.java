package org.timer.thread.chapter01;

import org.junit.Test;

public class SuspendThreadTest {

    @Test
    public void testRun(){
        try {
            SuspendThread threadA = new SuspendThread();
            threadA.start();
            Thread.sleep(5000);
            threadA.suspend();
            System.out.println("threadA 当前时间 "+ System.currentTimeMillis() + ",count的值为--->"+threadA.getCount());

            SuspendThread threadB = new SuspendThread();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
