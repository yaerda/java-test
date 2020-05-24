package com.fhou77.test.innerThread;

import java.util.concurrent.TimeUnit;

public class InnerRunnable2 {
    private int countDown = 5;
    private Thread t;

    InnerRunnable2(String name) {
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (countDown-- != 0) {
                    System.out.println(this);
                    try {
                        TimeUnit.MICROSECONDS.sleep(10);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }

            @Override
            public String toString() {
                return Thread.currentThread().getName() + ": " + countDown;
            }
        }, name);
        t.start();
    }
}
