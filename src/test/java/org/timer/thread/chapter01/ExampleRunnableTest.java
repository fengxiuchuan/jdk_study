package org.timer.thread.chapter01;

import org.junit.Test;

public class ExampleRunnableTest {

    @Test
    public void runThread(){
        Thread t = new Thread(new ExampleRunnable());
        t.start();
    }
}
