package com.fhou77.jdklearn;

public class JdkLearnApplication {
    public static void main(String args[]) {
        try {
            int[] array = new int[5];
            array[5] = 6;
        } catch (IndexOutOfBoundsException e) {
            log("抛出异常：");
            log("getMessage:",e.getMessage());
            log("toString()",e.toString());
            log("getLocalizedMessage",e.getLocalizedMessage());
            log("printStackTrace");
            e.printStackTrace();
        }

    }

    static void log(String... s) {
        for (String s1 : s) {
            System.out.println(s1);
        }
        System.out.println("-------------------------");
    }
}
}
