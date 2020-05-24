package com.fhou77.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableRun implements Callable<String> {
    private int c;

    CallableRun(int c) {
        this.c = c;
    }

    @Override
    public String call() throws InterruptedException {
        if (this.c > 9) {
            Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        }
        System.out.println(Thread.currentThread() + ": " + this.c);
        return String.valueOf(this.c++);
    }

    public static void main(String args[]) throws InterruptedException, ExecutionException {
        System.out.println("main tread start");
        ExecutorService exec = Executors.newCachedThreadPool();
        List<Future<String>> futureList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<String> f = exec.submit(new CallableRun(i));
            futureList.add(f);
        }
        futureList.add(exec.submit(new CallableRun(10)));


        exec.shutdown();
        System.out.println("main tread runin");
        Future stringFuture = futureList.get(1);
        System.out.println("callback: " + stringFuture.get());


        System.out.println("mian thread stop");

    }
}
