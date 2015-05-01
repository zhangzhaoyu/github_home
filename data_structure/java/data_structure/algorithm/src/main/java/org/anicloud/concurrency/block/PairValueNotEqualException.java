package org.anicloud.concurrency.block;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhaoyu on 15-4-15.
 */

class Pair {
    private int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pair() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void incrementX() {
        this.x++;
    }

    public void incrementY() {
        this.y++;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public class PairValueNotEqualException extends RuntimeException {
        public PairValueNotEqualException() {
            super("Pair values not equal : " + Pair.this);
        }

        public void checkState() {
            if (x != y) {
                throw new PairValueNotEqualException();
            }
        }
    }
}

abstract class PairManager {
    AtomicInteger atomicInteger = new AtomicInteger(0);
    protected Pair pair = new Pair();
    private List<Pair> storage = Collections.synchronizedList(new ArrayList<Pair>());

    public synchronized Pair getPair() {
        return new Pair(pair.getX(), pair.getY());
    }

    protected void store(Pair pair) {
        storage.add(pair);
        try {
            TimeUnit.MICROSECONDS.sleep(50);
        } catch (InterruptedException ignore) {

        }
    }

    public abstract void increment();
}

class PairManager1 extends PairManager {
    @Override
    public synchronized void increment() {
        pair.incrementX();
        pair.incrementY();
        store(getPair());
    }
}

class PairManager2 extends PairManager {
    @Override
    public void increment() {
        Pair temp = null;
        synchronized (this) {
            pair.incrementX();
            pair.incrementY();
            temp = getPair();
        }
        store(temp);
    }
}

class ExplicitPairManager extends PairManager {
    private Lock lock = new ReentrantLock();
    @Override
    public void increment() {
        lock.lock();
        try {
            Pair temp = null;
            pair.incrementX();
            pair.incrementY();
            temp = getPair();
            store(temp);
        } finally {
            lock.unlock();
        }
    }
}


