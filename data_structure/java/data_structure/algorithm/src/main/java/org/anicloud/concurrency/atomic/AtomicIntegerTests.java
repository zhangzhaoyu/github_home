package org.anicloud.concurrency.atomic;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zhaoyu on 15-4-15.
 */
public class AtomicIntegerTests implements Runnable {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private void evenIncrement() {
        atomicInteger.addAndGet(2);
    }

    public int getValue() {
        return atomicInteger.get();
    }

    @Override
    public void run() {
        while (true) {
            evenIncrement();
        }
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.err.println("Aborting");
                System.exit(0);
            }
        }, 5000);

        ExecutorService executorService = Executors.newCachedThreadPool();
        AtomicIntegerTests atomicIntegerTests = new AtomicIntegerTests();
        executorService.execute(atomicIntegerTests);

        while (true) {
            int val = atomicIntegerTests.getValue();
            if (val %2 != 0) {
                System.out.println(val);
                System.exit(0);
            }
        }
    }
}
