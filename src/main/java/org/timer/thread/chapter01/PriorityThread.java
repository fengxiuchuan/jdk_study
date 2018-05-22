package org.timer.thread.chapter01;

public class PriorityThread extends Thread {

    private volatile boolean isExit = false;
    private int count = 0;
    @Override
    public void run() {
        super.run();
        while (!isExit){
            count++;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isExit() {
        return isExit;
    }

    public void setExit(boolean exit) {
        isExit = exit;
    }
}
