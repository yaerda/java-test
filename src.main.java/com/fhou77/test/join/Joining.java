package com.fhou77.test.join;

public class Joining {
    public static void main(String[] args) {
        Sleepy sleepy1 = new Sleepy("sleepy1");
//        Sleepy sleepy2 = new Sleepy("Sleepy2");
//        Joiner joiner1 = new Joiner("joiner1", sleepy1);
//        Joiner joiner2 = new Joiner("joiner2", sleepy2);
//        sleepy2.interrupt();
        try {
            sleepy1.join(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main complete");
    }
}
