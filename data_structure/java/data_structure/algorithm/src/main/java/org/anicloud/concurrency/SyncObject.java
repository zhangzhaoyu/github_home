package org.anicloud.concurrency;

/**
 * Created by zhaoyu on 15-4-15.
 */

class DualSynch {
    private Object syncObject = new Object();

    public synchronized void f() {
        for (int i = 0; i < 5; i++) {
            System.out.println("f()");
            Thread.yield();
        }
    }

    public void g() {
        synchronized (syncObject) {
            for (int i = 0; i < 5; i++) {
                System.out.println("g()");
                Thread.yield();
            }
        }
    }
}

public class SyncObject {

    public static void main(String[] args) {
        final DualSynch dualSynch = new DualSynch();
        new Thread() {
            @Override
            public void run() {
                dualSynch.f();
            }
        }.start();

        dualSynch.g();
    }
}
