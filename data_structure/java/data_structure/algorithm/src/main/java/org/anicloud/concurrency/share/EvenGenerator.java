package org.anicloud.concurrency.share;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhaoyu on 15-4-9.
 */
class SynchronizedEvenGenerator extends IntGenerator {
    private int currnetEvenValue = 10;

    @Override
    public synchronized int next() {
        ++currnetEvenValue;     // danger here
        ++currnetEvenValue;
        return currnetEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new SynchronizedEvenGenerator());
    }
}

class LockEvenGenerator extends IntGenerator {
    private int currnetEvenValue = 10;
    private Lock lock = new ReentrantLock();
    @Override
    public int next() {
        lock.lock();
        try {
            ++currnetEvenValue;     // danger here
            ++currnetEvenValue;
            return currnetEvenValue;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        EvenChecker.test(new LockEvenGenerator());
    }
}

public class EvenGenerator extends IntGenerator {
    private int currnetEvenValue = 10;

    @Override
    public int next() {
        ++currnetEvenValue;     // danger here
        ++currnetEvenValue;
        return currnetEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
