package org.anicloud.concurrency;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

/**
 * Created by zhaoyu on 15-4-5.
 */

class SelfManaged implements Runnable {
    private int countDown = 5;
    private Thread thread = new Thread(this);

    public SelfManaged() {
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(this);
            if (--countDown > 0) return;
        }
    }
}

public class SimpleThread extends Thread {
    @Override
    public void run() {
        super.run();
    }
}
