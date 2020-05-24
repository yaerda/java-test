package com.fhou77.test.innerThread;

public class ThreadMethod {
    private int countDown = 5;
    private Thread t;
    private String name;

    ThreadMethod(String name) {
        this.name = name;
    }

    public void runTask() {
        if (t == null) {
            t = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (countDown-- != 0) {
                        System.out.println(this);
                    }
                }

                @Override
                public String toString() {
                    return Thread.currentThread().getName() + ": " + countDown;
                }
            }, name);
        }
        t.start();
    }
}
