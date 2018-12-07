package threads;

import java.util.concurrent.TimeUnit;

public class ListOff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    ListOff() {
    }


    ListOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" + countDown + ")";
    }


    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.print(status());
        Thread.yield();

        }

    }
}
