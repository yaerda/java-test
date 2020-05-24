package com.fhou77.test;

public class Log {
    public static void out(String... s) {
        for (String s1 : s) {
            System.out.println(s1);
        }
        System.out.println("");
    }
}
