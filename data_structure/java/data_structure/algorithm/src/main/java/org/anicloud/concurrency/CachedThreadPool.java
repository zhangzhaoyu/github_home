package org.anicloud.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhaoyu on 15-4-4.
 */
public class CachedThreadPool {

    public static void main(String[] args) {
        // CachedThreadPool 将为每一个任务创建一个线程
        // FixedThreadPool 使用有限的线程集来执行提交的任务
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();




    }

}
