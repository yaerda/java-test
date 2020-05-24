package com.fhou77.test.join;

public class Joiner extends Thread {
    private Sleepy sleepy;

    Joiner(String name, Sleepy sleepy) {
        super(name);
        this.sleepy = sleepy;
        start();
    }

    @Override
    public void run() {
        try {
            sleepy.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this + " has completed");
    }

    @Override
    public String toString() {
        return getName();
    }
}
