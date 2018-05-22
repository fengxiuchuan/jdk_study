package org.timer.thread.chapter01;

public class SuspendThread extends  Thread{

    private long count = 0;

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            count++;
        }
    }
}
