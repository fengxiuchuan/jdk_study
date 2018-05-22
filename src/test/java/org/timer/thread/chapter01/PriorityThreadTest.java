package org.timer.thread.chapter01;

import org.junit.Test;

public class PriorityThreadTest {

    @Test
    public void testRun()throws Exception{
        PriorityThread a = new PriorityThread();
        a.setPriority(Thread.NORM_PRIORITY - 2 );
        a.start();

        PriorityThread b= new PriorityThread();
        b.setPriority(Thread.NORM_PRIORITY + 3 );
        b.start();

        Thread.sleep(500);
        a.setExit(true);
        b.setExit(true);

        System.out.println("a .. count --> " + a.getCount());
        System.out.println("b .. count --> " + b.getCount());
    }
}
