package com.javarush.task.task14.task1421;

public class Singleton {
    private static Singleton non = new Singleton();
    public static Singleton getInstance() {
        return non;
    }
    private Singleton() {

    }
}