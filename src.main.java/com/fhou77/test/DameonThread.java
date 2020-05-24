package com.fhou77.test;

import java.util.concurrent.*;

public class DameonThread implements ThreadFactory, Runnable {


    @Override
    public void run() {
        while (true) {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(Thread.currentThread() + "");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool(new DameonThread());
        for (int i = 0; i < 10; i++) {
            executorService.execute(new DameonThread());
        }
        TimeUnit.SECONDS.sleep(2);
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
