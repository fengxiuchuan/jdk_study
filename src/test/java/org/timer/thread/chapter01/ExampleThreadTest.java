package org.timer.thread.chapter01;

import junit.framework.TestCase;
import org.junit.Test;


public class ExampleThreadTest {

    @Test
    public void runThread(){
        ExampleThread t = new ExampleThread();
        t.setName("这是继承Thread类的线程");
        t.start();
    }

}
