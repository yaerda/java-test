package com.fhou77.test;

public class ThreadRun extends Thread {
    private int c;

    ThreadRun(int c) {
        this.c = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            Log.out("Test " + this.c);
            Thread.yield();
        }
    }
}
