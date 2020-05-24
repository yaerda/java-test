package com.fhou77.test;


public class RunableRun implements Runnable {
    private int c;

    RunableRun(int c) {
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
