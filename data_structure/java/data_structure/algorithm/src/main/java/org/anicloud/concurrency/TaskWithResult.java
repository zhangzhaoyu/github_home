package org.anicloud.concurrency;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by zhaoyu on 15-4-4.
 */
public class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result of TaskWithResult " + id;
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            results.add(executorService.submit(new TaskWithResult(i)));

        for (Future<String> fs : results) {
            try {
                if (fs.isDone())
                    System.out.println(fs.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                executorService.shutdown();
            }
        }
    }
}
