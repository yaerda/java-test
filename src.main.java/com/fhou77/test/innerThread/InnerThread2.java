package com.fhou77.test.innerThread;

import java.util.concurrent.TimeUnit;

public class InnerThread2 {
    private int countDown = 5;

    InnerThread2(String name) {

        new Thread(name) {
            @Override
            public void run() {
                try {
                    while (countDown-- != 0) {
                        System.out.println(this);
                        TimeUnit.MILLISECONDS.sleep(100);
                    }
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }

            @Override
            public String toString() {
                return getName() + ": " + countDown;
            }
        }.start();
    }
}
