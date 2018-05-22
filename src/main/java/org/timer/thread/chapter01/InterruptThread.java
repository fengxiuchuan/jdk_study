package org.timer.thread.chapter01;

public class InterruptThread extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 5000000 ; i++) {
                if(interrupted()){
                    System.out.println("已经停止");
                    throw new InterruptedException("停止");
                }
                System.out.println("i="+(i + 1));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
