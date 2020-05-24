package com.fhou77.test.innerThread;

import java.util.concurrent.TimeUnit;

public class InnerRunable1 {
    private int countDown = 5;

    public class Inner implements Runnable {
        private Thread t;

        @Override
        public void run() {
            try {
                while (countDown-- != 0) {
                    System.out.println(this);
                    TimeUnit.MICROSECONDS.sleep(100);
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        @Override
        public String toString() {
            return t.getName() + ": " + countDown;
        }

        Inner(String name) {
            t = new Thread(this, name);
            t.start();
        }
    }

    InnerRunable1(String name) {
        new Inner(name);
    }
}
