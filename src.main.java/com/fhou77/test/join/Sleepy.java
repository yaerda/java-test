package com.fhou77.test.join;

import java.util.concurrent.TimeUnit;

public class Sleepy extends Thread {
    Sleepy(String name) {
        super(name);
        start();
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(this + ":interup:" + interrupted());
        }
        System.out.println(this+" has awaked");
    }
}
