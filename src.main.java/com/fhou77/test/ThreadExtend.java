package com.fhou77.test;

public class ThreadExtend extends Thread {
    private static int count = 0;
    private int down = 5;

    public ThreadExtend() {
        super(Integer.toString(count++));
        start();
    }

    @Override
    public String toString() {
        return "#" + getName() + "(" + down + ")";
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(this);
            if (down-- == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new ThreadExtend();
        }
    }
}
