package org.timer.thread.chapter01;

import org.junit.Test;

public class ComplexThreadTest {

    @Test
    public void testRun() throws Exception{
        ComplexThread t = new ComplexThread();
        t.setName("timer");
        t.start();

        Thread.sleep(1000);
    }
}
