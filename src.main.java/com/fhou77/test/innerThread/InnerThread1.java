package com.fhou77.test.innerThread;

import java.util.concurrent.TimeUnit;

public class InnerThread1 {
    private int countDown = 5;

    private class Inner extends Thread {
        Inner(String name) {
            super(name);
            start();
        }

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
    }

    public InnerThread1(String name) {
        new Inner(name);
    }
}
