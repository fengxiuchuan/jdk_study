package org.timer.thread.chapter01;

public class DaemonThread extends Thread{

    private int i = 0;
    @Override
    public void run() {
        super.run();
        try {
            while (true){
                i++;
                System.out.println("当前i的值为--->"+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
