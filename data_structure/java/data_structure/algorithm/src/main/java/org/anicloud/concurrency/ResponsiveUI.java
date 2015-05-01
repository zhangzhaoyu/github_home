package org.anicloud.concurrency;

import java.io.IOException;

/**
 * Created by zhaoyu on 15-4-9.
 */
public class ResponsiveUI extends Thread {
    private static volatile double d = 1;

    public ResponsiveUI() {
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while (true) {
            d = d + (Math.PI + Math.E);
        }
    }

    public static void main(String[] args) throws IOException {
        new ResponsiveUI();
        while (true) {
            System.in.read();
            System.out.println(d);
        }
    }
}
