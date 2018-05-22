package org.timer.thread.chapter01;

import org.junit.Before;
import org.junit.Test;

public class ExampleCurrentThreadTest {

    @Before
    public void init(){
        ExampleCurrentThread thread = new ExampleCurrentThread();
    }

    @Test
    public void runTest()throws Exception{
        ExampleCurrentThread run = new ExampleCurrentThread();
        run.setName("time");
        run.start();;

        Thread.sleep(100);
    }
}
