package org.anicloud.concurrency;

/**
 * Created by zhaoyu on 15-4-5.
 */

class Sleeper extends Thread {
    private int duration;

    public Sleeper(String name, int duration) {
        super(name);
        this.duration = duration;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interruped." + "isInterrupted() : " + isInterrupted());
            return;
        }
        System.out.println(getName() + " has awakened.");
    }
}

class Joiner extends Thread {
    private Sleeper sleeper;

    Joiner(String name, Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();
    }

    @Override
    public void run() {
        try {
            sleeper.join();
        } catch (InterruptedException e) {
            System.out.println("interrupted.");
            e.printStackTrace();
        }
        System.out.println(getName() + " join completed.");
    }
}

public class Joining {
    public static void main(String[] args) {
        Sleeper sleeper = new Sleeper("Sleeper", 1500);
        Sleeper grumpy = new Sleeper("grumpy", 1500);

        Joiner joiner = new Joiner("Doepy", sleeper);
        Joiner doc = new Joiner("doc", grumpy);

        grumpy.interrupt();
    }
}
