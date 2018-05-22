package org.timer.thread.chapter01;

import org.junit.Test;

public class InterruptThreadTest {

    @Test
    public void testRun()throws Exception{
        InterruptThread thread = new InterruptThread();
        thread.start();
        Thread.sleep(100);
        thread.interrupt();
    }
}
