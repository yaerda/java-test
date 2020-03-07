package com.fhou77.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Scanner;

public class TestRunApplication {
    public static void main(String args[]) {
        inputScan();

    }

    static void inputScan() {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
//        input.close();
        log("输入：", s1);

        try {
            BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
            String s2 = input2.readLine();
            log("输入2：", s2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void throwMethod() {
        try {
            int[] array = new int[5];
            System.exit(0);
            array[5] = 6;
        } catch (IndexOutOfBoundsException e) {
            log("抛出异常：");
        } finally {
            log("finally");
            int a = 1 / 0;
            log("finally2");
        }
    }

    static void log(String... s) {
        for (String s1 : s) {
            System.out.println(s1);
        }
        System.out.println("-------------------------");
    }
}
