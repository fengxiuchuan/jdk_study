package org.timer.thread.chapter01;

import org.junit.Test;

public class AliveThreadTest {

    @Test
    public void runTest()throws Exception{
        AliveThread t = new AliveThread();
        System.out.println("begin-->"+ t.isAlive());
        t.start();
        Thread.sleep(1000);
        System.out.println("end-->"+ t.isAlive());
        System.out.println();
    }
}
