package org.anicloud.concurrency.share;

/**
 * Created by zhaoyu on 15-4-9.
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;

    public abstract int next();
    public void cancel() {
        this.canceled = true;
    }

    public boolean isCanceled() {
        return this.canceled;
    }
}
