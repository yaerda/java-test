package com.fhou77.test;

public class RunableImpl implements Runnable {
    private int down = 5;
    private Thread thread = new Thread(this);

    public RunableImpl() {
        thread.start();
    }

    @Override
    public String toString() {
        return Thread.currentThread().getName() + "(" + down + ")";
    }

    @Override
    public void run() {
        while (true) {
            System.out.print(this);
            if (down-- == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new RunableImpl();
        }
    }
}
