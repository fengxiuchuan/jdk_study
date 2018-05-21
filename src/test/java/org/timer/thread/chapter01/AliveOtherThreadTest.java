package org.timer.thread.chapter01;

import org.junit.Test;

public class AliveOtherThreadTest {

    @Test
    public void runTest()throws Exception{
        AliveOtherThread run = new AliveOtherThread();
        run.setName("AliveOtherThread");
        Thread thread = new Thread(run);
        System.out.println("main begin thread isAlive=" + thread.isAlive());
        thread.setName("timer");
        thread.start();
        System.out.println("main end thread isAlive=" + thread.isAlive());

        Thread.sleep(3000);
    }
}
