package org.anicloud.concurrency;

import java.util.concurrent.ThreadFactory;

/**
 * Created by zhaoyu on 15-4-4.
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setDaemon(Boolean.TRUE);
        return thread;
    }
}
