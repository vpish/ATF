package com.lohika.atf.Tests;

public class Wait {
    public static void seconds(int n) {
        try {
            System.out.println("Wait " + n + " seconds");
            Thread.sleep(n * 1000);
        }
        catch (InterruptedException e) {}
    }
}
